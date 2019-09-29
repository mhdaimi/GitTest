package com.newtours.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserObject {
	public static WebDriver driver;
	public static WebDriver get(String browserName) throws Exception {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\FATEEMA\\Downloads\\InternetExplorer.exe");
			driver = new InternetExplorerDriver();
		} else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\FATEEMA\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invalid browser name: " + browserName);
		}
		return driver;
	}

}
