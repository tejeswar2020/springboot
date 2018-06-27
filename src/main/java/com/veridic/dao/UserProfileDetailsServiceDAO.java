package com.veridic.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.veridic.constants.Queries;
import com.veridic.entity.UserProfile;
import com.veridic.mapper.Mapper;

public class UserProfileDetailsServiceDAO implements UserDetailsService
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Mapper mapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
	    UserProfile userProfile = loadUserEntityByUsername(username);
	    if (userProfile == null) 
	    {
	      throw new UsernameNotFoundException(username + " not found");
	    }
	    return new UserDetails() 
	    {
		      @Override
		      public String getUsername() {
		        return username;
		      }
	
		      @Override
		      public boolean isAccountNonExpired() {
		        return true;
		      }
	
		      @Override
		      public boolean isAccountNonLocked() {
		        return true;
		      }
	
		      @Override
		      public boolean isCredentialsNonExpired() {
		        return true;
		      }
	
		      @Override
		      public boolean isEnabled() {
		        return true;
		      }
	
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				return null;
			}
	
			@Override
			public String getPassword() {
				return null;
			}
	    };
	}
	
	public void saveUser(UserProfile userProfile) throws Exception 
	{
	    jdbcTemplate.update(Queries.INSERT_USER_PROFILE, userProfile.getUserName(), userProfile.getSurname(), userProfile.getFirstName(), userProfile.getEmail(), userProfile.getGender(), userProfile.getDate(), userProfile.getMaritialStatus(), userProfile.getCellPhoneNumber());
	}

	public void deleteUser(String username) throws Exception 
	{
	    jdbcTemplate.update(Queries.DELETE_USER_PROFILE_BY_USERNAME, username);
	}
	  
	public UserProfile loadUserEntityByUsername(String username) 
	{
	    List<UserProfile> userProfiles = jdbcTemplate.query(Queries.LOAD_USER_PROFILE_BY_USERNAME, mapper::mapUserProfile, username);
	    if (userProfiles == null || userProfiles.size() < 1) 
	    {
	    	return null;
	    } 
	    else 
	    {
	    	return userProfiles.get(0);
	    }
	}
	
	 public List<UserProfile> loadAllUsers() throws Exception 
	 {
		    return jdbcTemplate.query(Queries.LOAD_ALL_USER_PROFILES, mapper::mapUserProfile);
	 }

	 public void updateUser(UserProfile userProfile) throws Exception 
	 {
		    jdbcTemplate.update(Queries.UPDATE_USER_PROFILE_BY_USERNAME, userProfile.getSurname(), userProfile.getFirstName(), userProfile.getEmail(), userProfile.getGender(), userProfile.getDate(), userProfile.getMaritialStatus(), userProfile.getCellPhoneNumber(), userProfile.getUserName());
	 }
}