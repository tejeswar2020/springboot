package com.veridic.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.veridic.constants.Queries;
import com.veridic.entity.Placements;
import com.veridic.mapper.Mapper;

public class PlacementsServiceDAO implements AbstractDAO
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
	public List<Placements> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Placements> getDataForId(String eid)
	{
		return jdbcTemplate.query(Queries.LOAD_PLACEMENTS_BY_EID, mapper::mapPlacements, eid);
	}
}
