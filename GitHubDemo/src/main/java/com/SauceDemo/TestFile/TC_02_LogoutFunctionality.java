package com.SauceDemo.TestFile;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMFile.LoginPage;
import com.SauceDemo.POMFile.Logout;
import com.SauceDemo.POMFile.UtilityClass;

public class TC_02_LogoutFunctionality {

	@Test
	public void logoutfinctionality() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("1. Properties of the browser are set");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("2.Chrome browser is open");
		
		driver.manage().window().maximize();
		System.out.println("3.Browser is maximize");
		
		driver.get("https://www.saucedemo.com");
		System.out.println("4.Sauce Demo website is open");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		lp.sendUserName();
		System.out.println("5.Username is entered");
		
		lp.sendPassword();
		System.out.println("6.Password is entered");
		
		lp.clickLogiButton();
		System.out.println("7.Login button clicked");
		
		UtilityClass.TakesScreenShot(driver);
		System.out.println("Screenshot is taken");
		
		Logout lg = new Logout(driver);
		lg.clickMenuButton();
		Thread.sleep(5000);
		
		lg.clickLogout();
		
		UtilityClass.TakesScreenShot(driver);
		System.out.println("Screenshot is taken");
		
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
	}
}
