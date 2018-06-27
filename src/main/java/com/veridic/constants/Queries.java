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
}
