package com.demo.uistore;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import automation.ebay.pageobject.fashionpage;
import automation.ebay.pageobject.loginpageobject;
import automation.ebay.pageobject.searchpage;
import automation.ebay.uistore.Searchpageui;

public class fashionrunner extends Baserunner {
	
	@Test
	
	public void fashion_test_1() throws InterruptedException, AWTException {
		
		log.info("Test Case Started");
		execution.IRCTGIT=execution.extent.createTest("Log validation");
		fashionpage fashion = new fashionpage(driver);
		fashion.Backpack();
		Thread.sleep(2000);
		
	}
	@Test
	public void fashion_test_3() throws InterruptedException, AWTException {
		log.info("Test Case Started");
		execution.IRCTGIT=execution.extent.createTest("Log validation");
		fashionpage fashion = new fashionpage(driver);
		fashion.Backpack();
		Thread.sleep(2000);
		fashion.itemprice();
		Thread.sleep(4000);
	}
	
	@Test
	public void Username_test_2() throws InterruptedException {
		log.info("Test Case Started");
		execution.IRCTGIT=execution.extent.createTest("Log validation");
		Thread.sleep(2000);
		execution.signinlink();
		execution.enterusername();
	}
	
}
