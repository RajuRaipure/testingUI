package com.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class register 
{
	By registerLink=By.linkText("REGISTER");
	
	
	
	public void clickOnRegister(WebDriver driver)
	{
		driver.findElement(registerLink).click();
	}

}
