package com.SauceDemo.TestFile;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.SauceDemo.POMFile.LoginPage;
import com.SauceDemo.POMFile.UtilityClass;

public class TC_01_LoginFunctionality {
	public void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("1. Properties of the browser are set");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("2.Chrome browser is open");
		
		driver.manage().window().maximize();
		System.out.println("3.Browser is maximize");
		
		driver.get("https://www.saucedemo.com");
		System.out.println("4.Sauce Demo website is open");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		lp.sendUserName();
		System.out.println("5.Username is entered");
		
		lp.sendPassword();
		System.out.println("6.Password is entered");
		
		lp.clickLogiButton();
		System.out.println("7.Login button clicked");
		
		UtilityClass.TakesScreenShot(driver);
		
		System.out.println("Logged in successfully");
		
		String expectedURL = "https://www.saucedemo.com";
		String actualURL = driver.getCurrentUrl();
		System.out.println("8.Actual URL is" + actualURL);
		
		Assert.assertEquals(actualURL, expectedURL);
		
		
			
	}

	}



