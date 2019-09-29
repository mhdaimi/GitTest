package com.newtours.testScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002 {

	@BeforeSuite
	public void beforeS() {
		System.out.println("Executing before suite");
	}
	
	@AfterSuite
	public void afterS() {
		System.out.println("Executing after suite");
	}
	
	
	@BeforeTest
	public void beforeT() {
		System.out.println("Executing before test");
	}
	
	@AfterTest
	public void afterT() {
		System.out.println("Executing after test");
	}
	
	@BeforeClass
	public void before() {
		System.out.println("Executing before class");
	}
	
	@AfterClass
	public void after() {
		System.out.println("Executing after class");
	}
	
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Executing before method");
	}
	
	@AfterMethod
	public void cleanUp() {
		System.out.println("Executing After method");
	}
	
  @Test()
  public void f() {
	  System.out.println("This is the test f");
  }
  
  @Test(priority=-1)
  public void a() {
	  System.out.println("This is the test a");
  }
}
