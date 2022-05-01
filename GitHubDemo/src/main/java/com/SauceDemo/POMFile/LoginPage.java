package com.SauceDemo.POMFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName()
	{
		userName.sendKeys("standard_user");
	}
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	public void clickLogiButton()
	{
		loginButton.click();
	}
	
}