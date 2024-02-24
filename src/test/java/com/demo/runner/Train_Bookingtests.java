package com.demo.runner;

import org.testng.annotations.Test;

import com.demo.pageobject.Train_bookingPage;
import com.demo.uistore.Train_booking_ui;

public class Train_Bookingtests extends BaseRunner {
	
	@Test
	public void searchTrain() throws InterruptedException{
		
		
		log.info("Test case started");
		Train_bookingPage arr = new Train_bookingPage(driver);
		arr.fromcityname("MYS");
		arr.searchTrain("MYS (MYSURU)");
		log.info("slt from city");
		Thread.sleep(3000);
		arr.tocityname("KSR BENGALURU - SBC ");
		arr.searchTrain("KSR BENGALURU - SBC ");
		log.info("slt to city");
		Thread.sleep(6000);
		arr.dateselection();
		Thread.sleep(6000);
		arr.searchbutton();
		Thread.sleep(6000);
		
	}
	
	
}