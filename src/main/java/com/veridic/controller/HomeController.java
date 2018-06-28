/*package com.veridic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.veridic.dao.KeyDatesServiceDAO;
import com.veridic.entity.KeyDates;

@Controller
public class HomeController 
{
	  @Autowired
	  private KeyDatesServiceDAO keyDatesServiceDAO;
	  
	  @RequestMapping(value = "/")
	  public String Page() 
	  {
		  System.out.println("invoked /");
		  return "home";
	  }
	  
	  @RequestMapping(value = "/home")
	  public ModelAndView homePage() 
	  {
		  System.out.println("invoked /home");
		  List<KeyDates> keyDates = getKeyDates();
		  
		  ModelAndView mandv = new ModelAndView("/home");
		  mandv.addObject("keyDates", keyDates);
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

}
*/