package com.veridic.mapper;

import com.veridic.entity.KeyDates;
import com.veridic.entity.User;
import com.veridic.entity.UserProfile;

import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class Mapper
{

  public User mapUser(ResultSet rs, int rowNum) throws SQLException 
  {
	  User user = new User();
	  user.setUsername(rs.getString("username"));
	  user.setPassword(rs.getString("password"));
	  user.setRole(rs.getString("role"));
	  return user;
  }
  
  public UserProfile mapUserProfile(ResultSet rs, int rowNum) throws SQLException 
  {
	  UserProfile userProfile = new UserProfile();
	  userProfile.setUserName(rs.getString("username"));
	  userProfile.setSurname(rs.getString("surname"));
	  userProfile.setFirstName(rs.getString("firstname"));
	  userProfile.setEmail(rs.getString("email"));
	  userProfile.setGender(rs.getString("gender"));
	  userProfile.setDate(rs.getString("date"));
	  userProfile.setMaritialStatus(rs.getString("maritialstatus"));
	  userProfile.setCellPhoneNumber(rs.getString("email"));
	  return userProfile;
  }
  
  public KeyDates mapKeyDates(ResultSet rs, int rowNum) throws SQLException
  {
	  KeyDates keyDates = new KeyDates();
	  keyDates.setEid(rs.getInt("eid"));
	  keyDates.setType(rs.getString("type"));
	  keyDates.setStatus(rs.getString("status"));
	  keyDates.setFrom(rs.getDate("from"));
	  keyDates.setTo(rs.getDate("to"));
	  return keyDates;
  }

}
