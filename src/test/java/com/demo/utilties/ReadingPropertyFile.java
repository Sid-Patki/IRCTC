package com.demo.utilties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingPropertyFile {
	Properties prop;
	public ReadingPropertyFile() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("PropertyFile/config.properties");
			prop.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getBrowser() {
		return prop.getProperty("browser");
	}
	public String getUrl() {
		return prop.getProperty("url");
	}
}
