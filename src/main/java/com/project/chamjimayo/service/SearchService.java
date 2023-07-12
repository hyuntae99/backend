package com.project.chamjimayo.service;

import com.jayway.jsonpath.JsonPath;
import com.project.chamjimayo.exception.CustomException;
import com.project.chamjimayo.domain.entity.Search;
import com.project.chamjimayo.domain.entity.User;
import com.project.chamjimayo.dto.SearchRequestDto;
import com.project.chamjimayo.dto.SearchResponseDto;
import com.project.chamjimayo.exception.ErrorCode;
import com.project.chamjimayo.repository.SearchRepository;
import com.project.chamjimayo.repository.UserRepository;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SearchService {

	private final SearchRepository searchRepository;
	private final UserRepository userRepository;

	// application.yml에 저장된 t-map AppKey
	@Value("${tmap.appKey}")
	private String tmapApikey;

	@Autowired
	public SearchService(SearchRepository searchRepository, UserRepository userRepository) {
		this.searchRepository = searchRepository;
		this.userRepository = userRepository;
	}

	/**
	 * 검색어에 대한 도로명 주소 검색을 수행하고, 검색 결과를 반환
	 */
	public List<SearchResponseDto> searchAddress(SearchRequestDto requestDTO) {
		// 검색 결과 가져올 개수와 검색어 설정
		int count = 5;
		String searchWord = requestDTO.getSearchWord();
		Integer userId = requestDTO.getUserId();

		// Tmap API 호출을 위한 URI 설정
		URI uri = UriComponentsBuilder.fromUriString("https://apis.openapi.sk.com")
			.path("/tmap/pois").queryParam("version", 1).queryParam("searchKeyword", searchWord)
			.queryParam("count", count).build().encode().toUri();

		// RestTemplate을 사용하여 API 호출
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.set("appKey", tmapApikey);
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

		RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, uri);

		ResponseEntity<String> responseEntity;
		try {
			responseEntity = restTemplate.exchange(requestEntity, String.class);
		} catch (HttpClientErrorException e) {
			throw new CustomException("not found api response", ErrorCode.API_NOT_FOUND);
		}

		// 사용자 정보 가져오기
		User user = userRepository.findById(userId)
			.orElseThrow(() -> new CustomException("not found user", ErrorCode.USER_NOT_FOUND));

		// Json 파일이 제대로 도착했는지 확인
		String responseBody = responseEntity.getBody();
		if (responseBody == null || responseBody.isEmpty()) {
			throw new CustomException("incorrect json file", ErrorCode.JSON_NOT_FOUND);
		}

		// API 응답에서 주소, 이름 리스트 추출
		List<String> fullAddressRoadList = extractFullAddressRoad(responseEntity.getBody());
		List<String> lotNumberAddressList = extractLotNumberAddress(responseEntity.getBody());
		List<String> nameList = extractName(responseEntity.getBody());


		List<SearchResponseDto> searchResponseDTOList = new ArrayList<>();

		// 각 주소를 Search 엔티티로 저장
		for (int i = 0; i < fullAddressRoadList.size(); i++) {
			String fullAddressRoad = fullAddressRoadList.get(i);
			String lotNumberAddress = lotNumberAddressList.get(i);
			String name = nameList.get(i);
			Search search = new Search(user, searchWord, fullAddressRoad, lotNumberAddress, name);
			searchRepository.save(search);

			// 검색 결과 DTO 생성 및 추가
			SearchResponseDto responseDTO = new SearchResponseDto(fullAddressRoad, lotNumberAddress, name);
			searchResponseDTOList.add(responseDTO);
		}

		return searchResponseDTOList;
	}


	/**
	 * API 응답에서 가게 이름을 추출하여 리스트로 반환
	 */
	private List<String> extractName(String responseBody) {
		return JsonPath.read(responseBody,
			"$.searchPoiInfo.pois.poi[*].name");
	}

	/**
	 * API 응답에서 도로명 주소를 추출하여 리스트로 반환
	 */
	private List<String> extractFullAddressRoad(String responseBody) {
		/**
		 * JSON 문자열에서 fullAddressRoad 추출하여 리스트로 반환
		 * searchPoiInfo의 pois의 poi의 모든 요소 중
		 * newAddressList의 newAddress의 모든 요소 중
		 * fullyAddressRoad 값을 반환한다.
		 */
		return JsonPath.read(responseBody,
			"$.searchPoiInfo.pois.poi[*].newAddressList.newAddress[*].fullAddressRoad");
	}

	/**
	 * API 응답에서 지번 주소를 추출하여 리스트로 반환
	 */
	private List<String> extractLotNumberAddress(String responseBody) {
		List<String> upperAddrNameList = JsonPath.read(responseBody,
			"$.searchPoiInfo.pois.poi[*].upperAddrName");
		List<String> middleAddrNameList = JsonPath.read(responseBody,
			"$.searchPoiInfo.pois.poi[*].middleAddrName");
		List<String> lowerAddrNameList = JsonPath.read(responseBody,
			"$.searchPoiInfo.pois.poi[*].lowerAddrName");
		List<String> firstNoList = JsonPath.read(responseBody,
			"$.searchPoiInfo.pois.poi[*].firstNo");
		List<String> secondNoList = JsonPath.read(responseBody,
			"$.searchPoiInfo.pois.poi[*].secondNo");

		// 위에서 추출한 각 리스트들을 하나씩 받아서 모두 더해서 지번 주소 만들기
		List<String> lotNumberAddressList = new ArrayList<>();
		for (int i = 0; i < upperAddrNameList.size(); i++) {
			String upperAddrName = upperAddrNameList.get(i);
			String middleAddrName = middleAddrNameList.get(i);
			String lowerAddrName = lowerAddrNameList.get(i);
			String firstNo = firstNoList.get(i);
			String secondNo = secondNoList.get(i);

			StringBuilder lotNumberAddress = new StringBuilder();
			lotNumberAddress.append(upperAddrName).append(" ")
				.append(middleAddrName).append(" ")
				.append(lowerAddrName).append(" ")
				.append(firstNo);

			// secondNo가 없거나 0이면 없이 지번 주소 완성
			if ((secondNo != null) && (!secondNo.isEmpty()) && (!secondNo.equals("0"))) {
				lotNumberAddress.append(" ").append(secondNo);
			}

			lotNumberAddressList.add(lotNumberAddress.toString());
		}

		return lotNumberAddressList;
	}

	/**
	 * 유저 아이디에 해당하는 사용자의 최근 도로명 주소 가져와서 검색 결과 DTO로 반환
	 */
	public SearchResponseDto getRecentRoadAddress(Integer userId) {
		// userRepository 에서 userId를 통해 user 객체를 가져옴
		User user = userRepository.findById(userId)
			.orElseThrow(() -> new CustomException("not found user", ErrorCode.USER_NOT_FOUND));

		// user 객체를 통해서 가장 최근에 검색된 상태가 1인 search 객체 받아오기
		Optional<Search> searchOptional = searchRepository.findTopByUserAndClickOrderBySearchIdDesc(user, 1);

		// 검색 결과 DTO 생성
		SearchResponseDto responseDTO;
		if (searchOptional.isPresent()) {
			Search search = searchOptional.get();
			responseDTO = new SearchResponseDto(
				search.getRoadAddress(), search.getLotNumberAddress(), search.getName());
		} else {
			// 빈 문자열 생성
			responseDTO = new SearchResponseDto("", "", "");
		}

		return responseDTO;
	}


	/**
	 * 도로명 주소를 클릭한 경우 해당 도로명 주소의 상태를 변경 -> 해당 주소를 클릭 처리하면 최종적으로 검색한 것으로 처리
	 */
	public ResponseEntity<String> clickAddress(Integer searchId) {
		// searchId로 search 를 받아옴
		Optional<Search> searchOptional = searchRepository.findById(searchId);
		if (searchOptional.isPresent()) {
			Search search = searchOptional.get();
			search.setClick(1); // 도로명 주소의 상태를 클릭된 상태로 변경
			searchRepository.save(search);
			return ResponseEntity.ok("정상적으로 클릭이 되었습니다.");
		} else {
			throw new CustomException("not found searchId", ErrorCode.SEARCH_NOT_FOUND);
		}
	}
}
