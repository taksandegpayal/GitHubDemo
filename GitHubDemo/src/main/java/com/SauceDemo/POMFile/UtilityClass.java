package com.SauceDemo.POMFile;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
public static void TakesScreenShot(WebDriver driver) throws IOException {
		
		Date date = new Date();
		DateFormat d = new  SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String newDate = d.format(date);
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourceFile= t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("E:\\Screenshot\\Kite" + newDate + ".jpg");
		FileHandler.copy(sourceFile, destFile);
		
}
}
