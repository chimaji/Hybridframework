package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;	
	
	public ConfigDataProvider()
	{
try {
	File src=new File("./Config/config.properties");
	
	FileInputStream fis=new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
} catch (Exception e) {
	System.out.println("property file is not loaded"+e.getMessage());
	
}

}
	
	
	
	public String getDatafromconfig(String KeyToSearch)
	{
	return	pro.getProperty(KeyToSearch);
		
		
	}
	
	
	public String getBrowsername()
	{
		return pro.getProperty("Browser");
		
	}
	public String getStagingUrl()
	{
		
return pro.getProperty("qaURL");
	}

}