package com.veridic.dao;

public interface AbstractDAO 
{
	void saveDataForId(String eid);
	
	void deleteDataForId(String eid);
	  
	void updateDataForId(String eid);
	
	// FIXME: Think about me again.
	void getAllData();
	
	void getDataForId(String eid);
	
}
