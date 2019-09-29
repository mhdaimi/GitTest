package com.newtours.testScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.newtours.objectRepo.ObjectRepository;
import com.newtours.pageObjects.FlightSearch;
import com.newtours.pageObjects.Login;
import com.newtours.utilities.BrowserObject;
import com.newtours.utilities.Excel;
import com.newtours.utilities.ScreenShot;

public class TC003  {
	public static WebDriver browser;
	
	@BeforeClass
	public void setUp() throws Exception {
		browser = BrowserObject.get(ObjectRepository.browser);
	}
	
	
  @Test(priority=1)
  public void login() throws Exception {
	  browser.get(ObjectRepository.url);
	  ArrayList<String> list = Excel.getRowData("Sheet2", 0);
	  Login.enterUsername(browser, list.get(0));
	  Login.enterPassword(browser, list.get(1));
	  Login.clickLogin(browser);
	  
	  if(browser.getTitle().equals("Find a Flight: Mercury Tours")) {
		  System.out.println("Login successful");
	  } else {
		  ScreenShot.get(browser, "TC003_login.jpg");
		  throw new  Exception("Login failed");
	  }
	  
  }
  
  @Test(priority=2)
  public void flightSearch() throws Exception {
	  ArrayList<String> list = Excel.getRowData(ObjectRepository.sheet2, ObjectRepository.rowOne);
	  FlightSearch.selectTripType(browser, list.get(0));
	  FlightSearch.selectPassenger(browser, list.get(1));
	  FlightSearch.selectDepartCity(browser, list.get(2));
	  FlightSearch.selectDepartMonth(browser, list.get(3));
	  FlightSearch.selectDepartDay(browser, list.get(4));
	  FlightSearch.selectArriveCity(browser, list.get(5));
	  FlightSearch.selectReturnMonth(browser, list.get(6));
	  FlightSearch.selectReturnDay(browser, list.get(7));
	  FlightSearch.selectClass(browser, list.get(8));
	  FlightSearch.selectAirline(browser, list.get(9));
	  
  }
  
}
