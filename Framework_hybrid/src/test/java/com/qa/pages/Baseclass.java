package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.annotations.ITest;

import com.qa.utility.BrowserFactory;
import com.qa.utility.ConfigDataProvider;
import com.qa.utility.ExcelDataProvider;
import com.qa.utility.Helper;

public class Baseclass {

	public WebDriver driver;
   public ConfigDataProvider config;
    public	ExcelDataProvider excel;
	@BeforeSuite
    
    public void setupSuit()
	{
		
	        	 excel=new ExcelDataProvider();
		         config=new ConfigDataProvider();
	
	}
	
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.applicationstart(driver, config.getBrowsername(), config.getStagingUrl());

	}
	
	@AfterMethod
	public void teardownMethod(ITestResult result)
	
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.capturescreenshot(driver);
		}
		
	}
	

	@AfterClass
	public void teardown() {
		BrowserFactory.quitbrowser(driver);
	}

}
