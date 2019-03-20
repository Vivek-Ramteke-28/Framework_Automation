package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;
	
	public ConfigDataProvider() throws IOException
	{
		
		File src=  new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			
			prop.load(fis);
		} catch (Exception e) {
			
			System.out.println("Not able to Load config file" + e.getMessage());
		}
		
	}
	
	public String getDataFromConfig(String keyToSearch)
	{
		return prop.getProperty(keyToSearch);
	}
	public String getBrowser()
	{
		return prop.getProperty("Browser");
	}
	public String getStagingURL()
	{
		return prop.getProperty("qaURL");
	}
	
	
}
