package com.newtours.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightSearch {
	
	public static void selectTripType(WebDriver driver, String trip) {
		driver.findElement(By.xpath(".//input[@value='" + trip +"']")).click();
	}

	public static void selectPassenger(WebDriver driver, String pass) {
		Select dd = new Select(driver.findElement(By.name("passCount")));
		dd.selectByVisibleText(pass);
	}
	
	public static void selectDepartCity(WebDriver driver, String city) {
		Select dd = new Select(driver.findElement(By.name("fromPort")));
		dd.selectByVisibleText(city);
	}
	
	public static void selectDepartMonth(WebDriver driver, String month) {
		Select dd = new Select(driver.findElement(By.name("fromMonth")));
		dd.selectByVisibleText(month);
	}
	
	public static void selectDepartDay(WebDriver driver, String day) {
		Select dd = new Select(driver.findElement(By.name("fromDay")));
		dd.selectByVisibleText(day);
	}
	
	public static void selectArriveCity(WebDriver driver, String city) {
		Select dd = new Select(driver.findElement(By.name("toPort")));
		dd.selectByVisibleText(city);
	}
	
	public static void selectReturnMonth(WebDriver driver, String month) {
		Select dd = new Select(driver.findElement(By.name("toMonth")));
		dd.selectByVisibleText(month);
	}
	
	public static void selectReturnDay(WebDriver driver, String day) {
		Select dd = new Select(driver.findElement(By.name("toDay")));
		dd.selectByVisibleText(day);
	}
	
	public static void selectAirline(WebDriver driver, String airline) {
		Select dd = new Select(driver.findElement(By.name("airline")));
		dd.selectByVisibleText(airline);
	}
	
	public static void selectClass(WebDriver driver, String travelClass) {
		driver.findElement(By.xpath("//*[@value='"+ travelClass +"']")).click();
	}
	
}
