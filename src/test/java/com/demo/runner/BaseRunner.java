package com.demo.runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.demo.intialization.BaseClass;
import com.demo.utilties.ReadingExcelFile;
import com.demo.utilties.ReadingPropertyFile;
import com.demo.utilties.ReporterGenerator;

public class BaseRunner {

	static WebDriver driver = null;
	static ReadingPropertyFile launch;
	static ReporterGenerator markscard;
	static ReadingExcelFile xl;
	static BaseClass browser;
	public static Logger log = LogManager.getLogger(BaseRunner.class);

	@BeforeSuite
	public void before() {
		xl = new ReadingExcelFile();
		launch = new ReadingPropertyFile();
		markscard = new ReporterGenerator();
		markscard.extentreport();
		browser = new BaseClass();
		log.info("Intializing all the methods");

	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver = browser.driverIntialization(launch.getBrowser(),launch.getUrl());
		log.info("Setting up browser");
	}
   
	@Test
   public void navigation() throws InterruptedException {
	   log.info("Success");
	   Thread.sleep(5000);
	   
   }
   @AfterMethod
   public void tearDownMethod() {
	   driver.close();
   }
   @AfterSuite
   public void teardown() {
	   browser.quitbrowser();
   }
}
