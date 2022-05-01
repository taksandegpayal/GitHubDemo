package com.SauceDemo.POMFile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver;
	

	
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	private List<WebElement> addToCart;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement addToCart4;
	
	@FindBy(xpath="//button[contains(text(),'Remove')]")
	private WebElement removeButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement totalItems;
	
	public AddToCart(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
			}
	
	public void clickAddToCart() throws InterruptedException
	{
		for(int i=0; i<addToCart.size(); i++)
		{
			addToCart.get(i).click();
			Thread.sleep(4000);
		}
	}
	
	public void select1Element()
	{
		addToCart4.click();
	}
	public String findText() 
	{
		String s = removeButton.getText();
		return s;
	}
	public void clickOnCart()
	{
		cart.click();
	}
	public void clickOnTotalItem() 
	{
		totalItems.click();
	}
	public String checkTotalItem()
	{
		String items = totalItems.getText();
		return items;
	}
	

}
