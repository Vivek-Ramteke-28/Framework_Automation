package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver)
	{
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath = System.getProperty("user.dir")+"/ScreenShots/FreeCRM_"+ getCurrentDateTime() + ".png";
		
		try {
			org.openqa.selenium.io.FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot Captured ");
			
		} catch (IOException e) {
			System.out.println("Unable to capture screen shot" + e.getMessage());
		}
		
		return screenshotPath;
		
	}
	
	
	
	public static String getCurrentDateTime()
	{
		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		
		return customformat.format(currentDate);

	}
	

	public void handleFrames()
	{
		
	}
	

	public void handleAlerts()
	{
		
	}
	
	

}
