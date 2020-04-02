package com.test.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.base.base;
import com.test.page.register;

public class TC_1test extends base
{
	WebDriver driver;
	String currentDirectory = System.getProperty("user.dir");
	Logger logger;
	ExtentReports extentreport=new ExtentReports(currentDirectory+"\\Output\\extentreports.html",false);
	ExtentTest test=extentreport.startTest("ExtentDemo");
	
	
	public TC_1test() 
	{
		logger = Logger.getLogger("Demo16_Basic_Configurator.class");
		PropertyConfigurator.configure("C:\\Users\\raju_raipure\\eclipse-workspace\\PageObjectModel\\log4j\\log4j.properties");
		//BasicConfigurator.configure();
	}
	@BeforeClass
	public void setup() 
	{
		// TODO Auto-generated constructor stub
		driver=getdriver();
		//System.out.println(driver);
	}
	@Test
	public void testcase()
	{
		Reporter.log("Testing");
		test.log(LogStatus.INFO, "Test started");
		register rg=new register();
		logger.info("Logging infomation");
	
		
		rg.clickOnRegister(driver);
		test.log(LogStatus.PASS, "Clicked on Register link");
		extentreport.endTest(test);
		extentreport.flush();
	}
	@SuppressWarnings("unused")
	private String capture(WebDriver driver) throws IOException {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("src/../ErrImages"+System.currentTimeMillis()+".png");
		String errflpath = destFile.getAbsolutePath();
		FileUtils.copyFile(srcFile, destFile);
		return errflpath;
		
	}
  
}
