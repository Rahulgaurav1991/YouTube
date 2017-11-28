package com.YouTube.Test;

import org.testng.annotations.Test;

import com.YouTube.generic.BaseTest;
import com.YouTube.page.LoginPage;

public class LoginTest extends BaseTest
{
	@Test
	public void verifySearch() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.search();
		lp.clickSearch();
		lp.playoption();
		Thread.sleep(100000);
		lp.changeTodefault();
		
	}

}
