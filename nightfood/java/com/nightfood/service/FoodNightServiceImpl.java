package com.nightfood.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.nightfood.dao.FoodNightdao;
import com.nightfood.dto.CafeTeriaVO;

@Service
public class FoodNightServiceImpl implements FoodNightService{

	@Inject
	private FoodNightdao dao;
	
	@Override
	public List<CafeTeriaVO> selectCafe() throws Exception {
		return dao.selectCafe();
	}

}
