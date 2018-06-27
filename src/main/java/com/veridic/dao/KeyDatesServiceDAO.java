package com.veridic.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.veridic.mapper.Mapper;

public class KeyDatesServiceDAO implements AbstractDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Mapper mapper;

	@Override
	public void saveDataForId(String eid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDataForId(String eid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDataForId(String eid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDataForId(String eid) {
		// TODO Auto-generated method stub
		
	}

}
