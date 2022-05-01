
package com.SauceDemo.TestFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMFile.AddToCart;
import com.SauceDemo.POMFile.LoginPage;
import com.SauceDemo.POMFile.UtilityClass;

import org.testng.Assert;

public class TC_03_AddToCartFunctionality extends TestBaseClass {
	
	@Test(priority=3)
	
	public void SelectMultipleProducts() throws IOException, InterruptedException
	{
		
		AddToCart ad = new AddToCart(driver);
		ad.clickAddToCart();
		
		String expecetedText = "REMOVE";
		String actualText = ad.findText();
		Assert.assertEquals(expecetedText, actualText);
		
	}
	
	@Test(invocationCount=5,priority=1)
	
	public void selectsingleproduct()
	{
		AddToCart ad = new AddToCart(driver);
		ad.select1Element();
		
	}
	
	@Test (priority=2)
	public void validatecartfunctionality() throws InterruptedException
	{
		AddToCart ad = new AddToCart(driver);
		ad.select1Element();
		ad.clickAddToCart();
		ad.clickOnTotalItem();
		ad.checkTotalItem();
		String expectedCount = "4";
		String actualCount = ad.checkTotalItem();
		System.out.println(actualCount);
		
		
		Assert.assertEquals(actualCount, expectedCount);
	}

}

