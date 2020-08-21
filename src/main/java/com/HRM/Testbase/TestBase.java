package com.HRM.Testbase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
   public static WebDriver driver;
	public static Properties prop;
	static String path;
  public  TestBase()
  {
	  try {
		  FileInputStream ip=new FileInputStream("F:\\eclipseprogs\\com.orangelivePOMdemo\\src\\main\\java\\com\\HRM\\configuration\\config.properties");
		  prop=new Properties();
		  prop.load(ip);
		 
	  }
	  catch(IOException e) {
		  e.printStackTrace();
		  
	  }
	  }
  public static void initialization()
  {
	  //WebDriverManager.chromedriver().setup();
	  path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver(); 
	  driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
	  driver.manage().window().maximize();
  }
  }
