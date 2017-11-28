package com.YouTube.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconstant
{
	public static WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
		
	}

}
