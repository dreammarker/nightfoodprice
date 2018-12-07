package com.nightfood.service;

import java.util.List;

import com.nightfood.dto.CafeTeriaVO;

public interface FoodNightService {

	public List<CafeTeriaVO> selectCafe() throws Exception;
}
