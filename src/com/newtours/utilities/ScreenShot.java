package com.newtours.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.newtours.objectRepo.ObjectRepository;

public class ScreenShot {
	
	public static void get(WebDriver driver, String testName) throws Exception {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(ObjectRepository.
				screenshotFolder+testName);
		FileUtils.copyFile(src, dest);
		
	}

}
