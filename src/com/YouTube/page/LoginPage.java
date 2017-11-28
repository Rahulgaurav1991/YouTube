package com.YouTube.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	//Utilization
	@FindBy(id="text")
	private WebElement login;
	
	
	@FindBy(id="search")
	private WebElement search;
	
	@FindBy(id="search-icon-legacy")
	private WebElement searchoption;
	
	@FindBy(id="video-title")
	private WebElement firstOption;
	
	
	@FindBy(id="logo-icon-container")
	private WebElement youtubebttn;
	
	
	
	
	
	//instillization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void search()
	{
		search.sendKeys("charlie puth");
	}
	public void clickSearch()
	{
		searchoption.click();
		
	}
	public void playoption()
	{
		firstOption.click();
	}
	
	
	public void changeTodefault()
	{
		youtubebttn.click();
	}
	
	
	
	

}
