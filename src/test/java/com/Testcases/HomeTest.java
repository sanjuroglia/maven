package com.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.Homepage;

public class HomeTest {
	Homepage obj;
	@BeforeClass
	public void demo()
	{
		obj=new Homepage();
	}
@Test	
public void logout()
{
	obj.logout();
}
}
