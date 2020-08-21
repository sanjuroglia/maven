package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.HRM.Testbase.TestBase;
import com.Pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage oo;
	String title;
 public LoginTest()
 {
	 super();
 }
 @BeforeSuite
 public void Launch()
 {
	 initialization();
	 oo=new LoginPage();
 }
 @Test
 public void checktitle()
 {
	 title=oo.verifyTitle();
	Assert.assertEquals(title, "OrangeHRM");
 }
 @Test
 public void Login_details()
 {
	 oo.Login();
 }
 
 
}
