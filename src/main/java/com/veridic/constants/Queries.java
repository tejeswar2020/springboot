package com.veridic.constants;

public interface Queries {

  //user table
  String INSERT_NEW_USER = "INSERT INTO users (username, password, role) VALUES (?,?,?);";
  String UPDATE_USER_BY_USERNAME = "UPDATE users SET password=?, role=? WHERE username=?;";
  String DELETE_USER_BY_USERNAME = "DELETE FROM users WHERE username=?;";
  String LOAD_ALL_USERS = "SELECT * FROM users;";
  String LOAD_USER_BY_USERNAME = "SELECT * FROM users WHERE username=?;";
  
  String LOAD_ALL_USER_PROFILES = "SELECT * FROM userProfile;";
  String LOAD_USER_PROFILE_BY_USERNAME = "SELECT * FROM userProfile WHERE username=?;";
  String INSERT_USER_PROFILE = "INSERT INTO userProfile (username, surname, firstName, email, gender, date, maritialStatus, cellPhoneNumber) VALUES (?,?,?,?,?,?,?,?);";
  String DELETE_USER_PROFILE_BY_USERNAME = "DELETE FROM userProfile WHERE username=?;";
  String UPDATE_USER_PROFILE_BY_USERNAME = "UPDATE userProfile SET surname=?, firstName=?, email=?, gender=?, date=?, maritialStatus=?, cellPhoneNumber=? WHERE username=?;";
  
  // Home page KeyDates
  String LOAD_ALL_KEY_DATES = "SELECT * FROM keydates;";
  String LOAD_KEY_DATES_BY_EID = "SELECT * FROM keydates WHERE eid=?;";
  String INSERT_KEY_DATES = "INSERT INTO keydates (type, status, from, to, eid) VALUES (?,?,?,?,?);";
  String DELETE_KEY_DATES_BY_EID = "DELETE FROM keydates WHERE eid=?;";
  String UPDATE_KEY_DATES_BY_EID = "UPDATE keydates SET from=?, to=? WHERE eid=? AND type=?;";
  
  String LOAD_ALL_PLACEMENTS = "SELECT * FROM placements;";
  String LOAD_PLACEMENTS_BY_EID = "SELECT * FROM placements WHERE eid=?;";
  String INSERT_PLACEMENTS = "INSERT INTO placements (jobCode, title, client, startDate, eid) VALUES (?,?,?,?,?);";
  String DELETE_PLACEMENTS_BY_EID = "DELETE FROM placements WHERE eid=? AND jobCode=?;";
  String UPDATE_PLACEMENTS_BY_EID = "UPDATE placements SET title=?, startDate=? WHERE eid=? AND jobCode=?;";
}
