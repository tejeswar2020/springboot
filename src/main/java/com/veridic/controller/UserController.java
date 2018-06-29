package com.veridic.controller;

import com.veridic.dao.KeyDatesServiceDAO;
import com.veridic.dao.PlacementsServiceDAO;
import com.veridic.dao.UserDetailsServiceDAO;
import com.veridic.dao.UserProfileDetailsServiceDAO;
import com.veridic.entity.KeyDates;
import com.veridic.entity.Placements;
import com.veridic.entity.User;
import com.veridic.entity.UserProfile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

  @Autowired
  private UserDetailsServiceDAO userDetailsServiceDAO;
  
  @Autowired
  private UserProfileDetailsServiceDAO userProfileDetailsServiceDAO;
  
  @Autowired
  private KeyDatesServiceDAO keyDatesServiceDAO;
  
  @Autowired
  private PlacementsServiceDAO placementsServiceDAO;

  @RequestMapping(value = "/registration", method = RequestMethod.POST)
  public String registration(User newUser) {
    try {
      if (userDetailsServiceDAO.loadUserEntityByUsername(newUser.getUsername()) != null) {
        return "redirect:" + "/login?registration&error";
      } else {
        userDetailsServiceDAO.saveUser(newUser);
        return "redirect:" + "/login?registration&success";
      }
    } catch (Exception e) {
      e.printStackTrace();
      return "redirect:" + "/login?registration&errorServer";
    }
  }

  @RequestMapping(value = "/profileUpdate", method = RequestMethod.POST)
  public String profileUpdate(UserProfile newUserProfile) 
  {
		try 
		{
		    if (userProfileDetailsServiceDAO.loadUserEntityByUsername(newUserProfile.getUserName()) != null) 
		    {
		    	userProfileDetailsServiceDAO.updateUser(newUserProfile);
		    	return "redirect:" + "/profileDisplay" ;
		    }
		    else
		    {
		    	userProfileDetailsServiceDAO.saveUser(newUserProfile);
		    	return "redirect:" + "/profileDisplay&success";
		    }
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return "redirect:" + "/profileDisplay&errorServer";
		}
  }
  
  @RequestMapping(value = "/profileDisplay", method = RequestMethod.GET)
  public ModelAndView profileDisplay() 
  {
	  	System.out.println("invoked profileDisplay");
	    UserProfile userProfile = getUserDetails();
		
		ModelAndView mandv = new ModelAndView("/profile");
		mandv.addObject("messages", userProfile);
	  	
		return mandv;
  }

  @PreAuthorize("isAnonymous()")
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String loginPage() {
    return "login";
  }
  
  @RequestMapping(value = {"/home", "/"})
  public ModelAndView homePage() 
  {
	  System.out.println("invoked /home");
	  ModelAndView mandv = new ModelAndView("/home");
	  
	  List<KeyDates> keyDates = getKeyDates();
	  mandv.addObject("keyDates", keyDates);
	  
	  List<Placements> placements = getPlacements();
	  mandv.addObject("placements", placements);
	  
	  UserProfile userProfile = getUserDetails();
	  mandv.addObject("userProfile", userProfile);
	  
	  return mandv;
  }

  public List<KeyDates> getKeyDates() 
  {
	    System.out.println("invoked getKeyDates");
	 
	    List<KeyDates> keyDates = null;
		try 
		{
			// FIXME: for the String userName param.
			keyDates = keyDatesServiceDAO.getDataForId("1");
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return keyDates;
  }
  
  public List<Placements> getPlacements() 
  {
	    System.out.println("invoked getPlacements");
	 
	    List<Placements> placements = null;
		try 
		{
			// FIXME: for the String userName param.
			placements = placementsServiceDAO.getDataForId("1");
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return placements;
  }
  
  	private UserProfile getUserDetails() 
	{
		System.out.println("invoked getUserDetails");
	 
		UserProfile userProfile = null;
		try 
		{
			// FIXME: for the String userName param.
			userProfile = userProfileDetailsServiceDAO.loadUserEntityByUsername("teja");
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userProfile;
	}
  
}