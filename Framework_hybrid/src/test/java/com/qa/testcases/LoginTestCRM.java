package com.qa.testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.qa.pages.Baseclass;
import com.qa.pages.Loginpage;
import com.qa.utility.ExcelDataProvider;
import com.qa.utility.Helper;

import okhttp3.internal.http2.Header;

public class LoginTestCRM extends Baseclass {

	@Test
	public void loginApp() {
		
		
		

		Loginpage log = PageFactory.initElements(driver, Loginpage.class);

		log.loginToCrm(excel.getStringData("LoginData", 0, 0), excel.getStringData("LoginData", 0, 1));

	
	
	}

}
