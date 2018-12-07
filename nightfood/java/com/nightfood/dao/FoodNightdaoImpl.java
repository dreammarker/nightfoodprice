package com.nightfood.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nightfood.dto.CafeTeriaVO;

@Repository
public class FoodNightdaoImpl implements FoodNightdao{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.nightfood.mapper.MemberMapper";
	
	public List<CafeTeriaVO> selectCafe() throws Exception {
		return sqlSession.selectList(Namespace+".selectCafe");
	}

}
