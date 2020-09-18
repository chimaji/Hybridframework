package com.qa.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	// WebDriver driver;

	public static WebDriver applicationstart(WebDriver driver, String browsername, String appUrl) {

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

			System.setProperty("webdriver.firfox.bin", "C:\\Users\\HP\\Downloads\\firefoxe.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("browser is not valid");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public static void quitbrowser(WebDriver driver) {
		driver.quit();

	}

}
