package com.SauceDemo.POMFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
	public Logout(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMenuButton()
	{
		menuButton.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}
}
