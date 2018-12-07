package com.nightfood.dao;

import java.util.List;

import com.nightfood.dto.CafeTeriaVO;

public  interface FoodNightdao {
	public List<CafeTeriaVO> selectCafe() throws Exception;
}
