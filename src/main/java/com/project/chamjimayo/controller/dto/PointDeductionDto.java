package com.project.chamjimayo.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class PointDeductionDto {
	@Schema(type = "Long", example = "1")
	private Long userId;

	@Schema(type = "Integer", example = "2000")
	private Integer point;

	private PointDeductionDto(Long userId, Integer point) {
		this.userId = userId;
		this.point = point;
	}

	public static PointDeductionDto create(Long userId, Integer point) {
		return new PointDeductionDto(userId, point);
	}
}
