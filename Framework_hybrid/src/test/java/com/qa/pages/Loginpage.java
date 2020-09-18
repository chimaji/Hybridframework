package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver)

	{
		this.driver = driver;

	}

	@FindBy(xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement login1;
	@FindBy(name = "email")
	WebElement usename;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;

	public void loginToCrm(String uname, String pass) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		login1.click();
		usename.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();

	}

}
