package com.learnautomation.testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass {

	
	@Test(priority=1)
	public void loginApp1() throws InterruptedException, FileNotFoundException
	{
		logger = report.createTest("Login to CRM");
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);	
		
		logger.info("Starting Application");
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("Login Done Successfully");
	} 
	


	@Test(priority=2)
	public void loginApp2() throws InterruptedException, FileNotFoundException
	{
		logger = report.createTest("Logout");
		
		
		logger.fail("Logout fail");
	} 
	
	
	
	
}	
