package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.Testbase.TestBase;

public class LoginPage extends  TestBase
{
	//locators
	//methods
	//page factory class
	@FindBy(id="txtUsername")
	WebElement uname;
	
	@FindBy(id="txtPassword")
	WebElement pass;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	@FindBy(linkText="Forget your password")
	WebElement forgetpass;
	 
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public  String verifyTitle()
	{
		return driver.getTitle();
	}
	public void Login() {
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		login.click();
	}
}
