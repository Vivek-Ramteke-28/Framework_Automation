package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public void loginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;

	
	public void loginToCRM(String usernameApplication, String passwordApplication) throws InterruptedException
	{
		Thread.sleep(2000);
		
		uname.sendKeys(usernameApplication);
		pwd.sendKeys(passwordApplication);
		loginBtn.click();
	}	
	
	
}
