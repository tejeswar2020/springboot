package com.veridic.dao;

import java.util.List;

public interface AbstractDAO 
{
	void saveDataForId(String eid);
	
	void deleteDataForId(String eid);
	  
	void updateDataForId(String eid);
	
	// FIXME: Think about me again.
	List getAllData();
	
	List getDataForId(String eid);
	
}
