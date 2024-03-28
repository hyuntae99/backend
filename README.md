# <img src="https://avatars.githubusercontent.com/u/138138861?s=200&v=4" width="70" height="70"/> 참지마요
**유, 무료 화장실 중개 앱**
<br><br>

## 📖 Development Tech
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white">
<img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">
<img src="https://img.shields.io/badge/nginx-%23009639.svg?style=for-the-badge&logo=nginx&logoColor=white">
<img src="https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white">
<br>

# 💼 Server Architecture
<img src="https://velog.velcdn.com/images/jmjmjmz732002/post/a6c7a7be-ff27-4723-bfe2-d458ed641fab/image.png">
<br>


# 📝 Service

**동영상을 GIF로 바꾸는 과정이 원할하지 않아서 GIF가 이상한 점 먼저 사과 드립니다.**

## 1. 로그인 및 회원가입
카카오 및 네이버를 통한 SNS 로그인을 제공합니다.

<img src = "https://private-user-images.githubusercontent.com/101180610/316489357-975750da-741c-4f98-9883-80a6393a9c72.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODcxNTEsIm5iZiI6MTcxMTU4Njg1MSwicGF0aCI6Ii8xMDExODA2MTAvMzE2NDg5MzU3LTk3NTc1MGRhLTc0MWMtNGY5OC05ODgzLTgwYTYzOTNhOWM3Mi5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDQ3MzFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02YmU3OTEzNWVmYjYwN2JlMjE5ZmVjZTk3ZWEzNzYwMDczNjI3M2RjZWEyMDQwYzc5ZTI0N2I1YWFlODg4NmIwJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.-UmRB4Wk65Nyra7WlW3SbFQRZNcfPH4ESq3fXnxtFrM">
<br>

## 2. 주변 화장실 찾기 (검색하기 or 현재 위치 사용)
T MAP API를 이용한 검색 기능과 현재 위치를 사용한 지도 정보 제공합니다.<br>
(무료 화장실의 정보는 공공 데이터 포털을 사용하여 DB에 저장하였습니다.)

<img src = "https://private-user-images.githubusercontent.com/101180610/316493506-78d0f53d-ac1d-4807-92ae-b1dc07cd217d.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODc1MDYsIm5iZiI6MTcxMTU4NzIwNiwicGF0aCI6Ii8xMDExODA2MTAvMzE2NDkzNTA2LTc4ZDBmNTNkLWFjMWQtNDgwNy05MmFlLWIxZGMwN2NkMjE3ZC5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDUzMjZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05N2JjNjVlNzc0MTI3MzJjZTNiYTNhYjNmY2M3ZGYyNDY1MzBmNmMxNTNlMmYyYWY3MWU2Y2Q2MGM5NjcyZDllJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.5wQDd8BZEuTz2p1mcHcyjwY7MEdESCB124_26ePw1mU" width="400" height="600"/>
<br>

## 3. 화장실 상세 정보 (상세 정보 확인 및 리뷰 확인)
화장실의 좌변기, 소변기, 거울, 세면대 등의 상세 정보를 제공합니다.<br>
해당 화장실의 리뷰 확인 기능을 제공합니다,

<img src = "https://private-user-images.githubusercontent.com/101180610/316504876-dbd7b5d7-b329-4099-ba54-26d83f00b24e.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODcxNTEsIm5iZiI6MTcxMTU4Njg1MSwicGF0aCI6Ii8xMDExODA2MTAvMzE2NTA0ODc2LWRiZDdiNWQ3LWIzMjktNDA5OS1iYTU0LTI2ZDgzZjAwYjI0ZS5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDQ3MzFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kOGU1ODNiNjMwMzY4YWVjMDVmN2NjZTFiMzMxM2UwODRiZDc3ZDZiYmI5NmQ1NjkzNDUyM2Q4YmY2OTk3ZWU1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.6320ZAwi5WBObEsbs6Gez04sE1P8_cOAx0Gnf2bFWEU">
<br>

## 4-1. 유료 화장실 QR 결제하기 
미리 충전해둔 포인트를 통해서 결제합니다.<br>
유료 화장실을 등록하신 영업자에게 QR 도어락을 제공하여 QR로 화장실을 개방하도록 설계하였습니다.<br>
(QR 도어락의 경우, 제작이 가능하다고 연락을 받았지만 아직 베타버전의 어플이라서 실물로 구현하지는 못했습니다.)

<img src = "https://private-user-images.githubusercontent.com/101180610/316499027-91254c92-6bde-4e97-bce6-9b208586eeb1.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODc1MzcsIm5iZiI6MTcxMTU4NzIzNywicGF0aCI6Ii8xMDExODA2MTAvMzE2NDk5MDI3LTkxMjU0YzkyLTZiZGUtNGU5Ny1iY2U2LTliMjA4NTg2ZWViMS5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDUzNTdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iNmQ1OTY3ZmZkNGVhZjY1MTZiYTlmZDc4OTQ5ZDNhYjZhYzQzYTcxMGEzNDQxMDg5NGJjNzFkNDNjYzMzOWI3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.kc5tHPHwWZZ9_KvgX5XHMH5i7IfFwG4I2gS7Y8vTirs" width="400" height="600"/>
<br>

## 4-2. 결제 후 미니게임 및 사용 후기 작성
화장실을 이용하면서 심심하실까봐 간단한 두더지 게임도 만들었습니다.<br>
이후 화장실 이용이 끝나면 리뷰를 요청하는 알림이 나오게 만들었습니다.

<img src = "https://private-user-images.githubusercontent.com/101180610/316499358-7f190211-48c5-435d-96ab-3fbd8030215c.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODc1ODAsIm5iZiI6MTcxMTU4NzI4MCwicGF0aCI6Ii8xMDExODA2MTAvMzE2NDk5MzU4LTdmMTkwMjExLTQ4YzUtNDM1ZC05NmFiLTNmYmQ4MDMwMjE1Yy5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDU0NDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1jY2EyMjk0NTdmNjM1NmMyMjYxOWQ2N2EwZGE2MjI0OTA4OTIwNmFjMmMzM2ZlNDc4OGQ3NTdlZTlhMzRjZDNjJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.nHycUq5E5I-Hji7ElHH70jakCWHOz5KW4B9-7V34xpk" width="400" height="600"/>
<br>

## 5. 리뷰 등록하기
최대한 간단하면서 필요한 정보를 얻을 수 있게 만들었습니다.

<img src = "https://private-user-images.githubusercontent.com/101180610/316499426-9979e854-3356-4410-b3a6-1d6203655d9f.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODc2MTAsIm5iZiI6MTcxMTU4NzMxMCwicGF0aCI6Ii8xMDExODA2MTAvMzE2NDk5NDI2LTk5NzllODU0LTMzNTYtNDQxMC1iM2E2LTFkNjIwMzY1NWQ5Zi5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDU1MTBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iNzQ1OTI1YzU1ZDFmZjNlOTY0ZDMxYTcyMDc2OGRhZmJjYWRmNDFmOTkyZDNhYWFmOTViMDgzOTM5OTA5OWI2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.dhBEGcZuwPPFAgWDWGn4ZGuVRaFodxRHsqHvQ3PO58s" width="400" height="600"/>
<br>

## 6-1. 근처 화장실 찾기 (거리순, 별점 높은 순, 별점 낮은 순)
근처 화장실 리스트를 제공합니다.

<img src = "https://private-user-images.githubusercontent.com/101180610/316499061-82264cd1-9395-4760-b6bf-decb2f69e5fe.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODc1MzcsIm5iZiI6MTcxMTU4NzIzNywicGF0aCI6Ii8xMDExODA2MTAvMzE2NDk5MDYxLTgyMjY0Y2QxLTkzOTUtNDc2MC1iNmJmLWRlY2IyZjY5ZTVmZS5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDUzNTdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yMDYyYzg4ZjNiNTU0ZWFjY2NmNGJhZTkyYzcyYzhhM2YyY2IyYzk1MDU2MTA4YzZiOWVhMTgzYzBjMTJhNzQ3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.WykGgVFB8G_DT1VP8EhrfvMQ7MItWtniRYGH1C-XkFg">
<br>

## 6-2. 근처 화장실 찾기 (거리 범위 설정하기)
근처 화장실 리스트를 제공하는 거리의 범위를 설정할 수 있습니다.

<img src = "https://private-user-images.githubusercontent.com/101180610/316499555-411fbaf9-b8a1-4dcd-808f-f0fc4d34f34c.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODc2NTMsIm5iZiI6MTcxMTU4NzM1MywicGF0aCI6Ii8xMDExODA2MTAvMzE2NDk5NTU1LTQxMWZiYWY5LWI4YTEtNGRjZC04MDhmLWYwZmM0ZDM0ZjM0Yy5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDU1NTNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0zZDc3MDhmM2UzNjA2ODRhNjYwMjU0MmY4NDIxNGMxNDg3MDdmZDIzOTlmMmM1Yzc1ZWU5M2YwNjg3N2E1MTNhJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.9h1voQNK9iHHbCJD5uQHKyTb1sF0uSO826-ztawWUSE">
<br>

## 7. 커뮤니티 (미구현)
커뮤니티 기능도 추가할 생각입니다.

<img src = "https://private-user-images.githubusercontent.com/101180610/316499471-f003c852-e7f6-4732-b6e2-276e5535a388.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODc2MTAsIm5iZiI6MTcxMTU4NzMxMCwicGF0aCI6Ii8xMDExODA2MTAvMzE2NDk5NDcxLWYwMDNjODUyLWU3ZjYtNDczMi1iNmUyLTI3NmU1NTM1YTM4OC5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDU1MTBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1mNzdiODc1NGU2YjcwNmZkY2IwZDU1Yjk1YzVmNGVmMTljNDJkNzFkMDE5MGIzMDFlMmUwMmRmZjVjZGI4YmFiJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.3wbaogw8gh0VvxPpJJVAEIXn-FOewjvZPNJ96jPd91w">
<br>

## 8. 마이페이지 (개인정보 수정, 리뷰 내역, 사용 내역) 및 포인트 충전 (구글 플레이스토어) 
마이페이지에서는 개인정보 수정과 리뷰 내역, 사용 내역을 확인할 수 있습니다.<br>
또한 이용에 필요한 포인트를 구글 플레이스토어와 연동하여 결제하도록 만들었습니다.

<img src = "https://private-user-images.githubusercontent.com/101180610/316499575-319b6129-4b5e-4d6f-a5e9-a7957fd07bf2.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTE1ODc2NTMsIm5iZiI6MTcxMTU4NzM1MywicGF0aCI6Ii8xMDExODA2MTAvMzE2NDk5NTc1LTMxOWI2MTI5LTRiNWUtNGQ2Zi1hNWU5LWE3OTU3ZmQwN2JmMi5naWY_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwMzI4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDMyOFQwMDU1NTNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00ZTI3MGYwOWYwNmY2NzA2YmFiZmU3MjliNTc0OTU0NjFjMzczMTZmZjAyYTM5MGE3YmQ4ZDdlMDE4ZTgyYTU2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.dI46DE-JZeJCnLbAsuKdn4X9mb8DF_1hZ5k-y81QMRk">
<br>


