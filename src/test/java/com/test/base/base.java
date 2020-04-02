package com.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class base 
{
	private WebDriver driver;
	public WebDriver getdriver()
	{
		System.out.println(driver);
		return driver;
	}
	
	@BeforeClass
	@Parameters({ "browserName", "url" })
	public void setup(String browser, String url1)
	{
		initilaize(browser, url1);
	}

	
	private void initilaize(String browser, String url1) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\IVSSA_Demo10_PageObjectModel _28Apr17_1414\\Demo10_PageObjectModel\\src\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url1);
		
	}

}
