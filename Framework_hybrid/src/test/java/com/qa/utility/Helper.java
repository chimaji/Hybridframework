package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Helper {

	// capture screenshot/synk issue/handle frame/handle alert/
	public static void capturescreenshot(WebDriver driver) {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileHelper.copyFile(src, new File("./Screenshot/Framework_hybrid_" +captureCurrentTimespam()+ ".png"));
			System.out.println("screenshot taken");
		} catch (Exception e) {
			System.out.println("screenshot not captured" + e.getMessage());

		}
	}

	
	public static String captureCurrentTimespam()
	{
		
		DateFormat currentdateformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date current=new Date();
		
	return	currentdateformat.format(current);
	}
	
}
