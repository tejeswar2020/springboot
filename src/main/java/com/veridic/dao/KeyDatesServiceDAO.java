package com.veridic.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.veridic.constants.Queries;
import com.veridic.entity.KeyDates;
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
	public List<KeyDates> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KeyDates> getDataForId(String eid)
	{
		return jdbcTemplate.query(Queries.LOAD_KEY_DATES_BY_EID, mapper::mapKeyDates, eid);
	}
}
