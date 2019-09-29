package com.newtours.testScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtours.objectRepo.ObjectRepository;
import com.newtours.pageObjects.Login;
import com.newtours.utilities.BrowserObject;
import com.newtours.utilities.Excel;

public class TC001 {
	static WebDriver browser;
	
	@BeforeMethod
	public void setUp() throws Exception {
		System.out.println("Executing before method");
		browser = BrowserObject.get(ObjectRepository.browser);
	}
	
	@AfterMethod
	public void cleanUp() {
		System.out.println("Executing After method");
		browser.quit();
	}
	
  @Test
  public void login() throws Exception {
	  browser.get(ObjectRepository.url);
	  ArrayList<String> list = Excel.getRowData("Sheet1", 0);
	  Login.enterUsername(browser, list.get(0));
	  Login.enterPassword(browser, list.get(1));
	  Login.clickLogin(browser);
	  Assert.assertEquals(browser.getTitle(), "Find a Flight: Mercury Tours:");
  }
  
  @Test
  public void loginInvalid() throws Exception {
	  browser.get(ObjectRepository.url);
	  ArrayList<String> list = Excel.getRowData("Sheet1", 1);
	  
	  Login.enterUsername(browser, list.get(0));
	  Login.enterPassword(browser, list.get(1));
	  Login.clickLogin(browser);
	  Assert.assertEquals(browser.getTitle(), "Sign-on: Mercury Tours");
  }
  
  
}
