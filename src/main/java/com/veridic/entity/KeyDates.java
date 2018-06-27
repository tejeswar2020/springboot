package com.veridic.entity;

import java.sql.Date;

public class KeyDates 
{
	int eid;
	
	String type;
	
	String status;
	
	Date from;
	
	Date to;
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public Date getFrom()
	{
		return from;
	}
	
	public void setFrom(Date from) 
	{
		this.from = from;
	}
	
	public Date getTo() 
	{
		return to;
	}
	
	public void setTo(Date to) 
	{
		this.to = to;
	}
}
