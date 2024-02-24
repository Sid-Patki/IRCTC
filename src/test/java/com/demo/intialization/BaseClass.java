package com.demo.intialization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	WebDriver driver;

	public WebDriver driverIntialization(String browser, String Url) {
		if (browser.equals("edge")) {
			System.setProperty("Webdriver.edge.driver", "./Driver/ccc.exe");
			driver = new EdgeDriver();
		} else if (browser.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "./Driver/ccc.exe");//???
			driver = new EdgeDriver();
		}

		driver.get(Url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public void quitbrowser() {
		driver.quit();
	}

	}
