package com.demo.runner;

import org.testng.annotations.Test;
import com.demo.pageobject.Display_Train;
import com.demo.pageobject.Train_bookingPage;

public class Display_TrainTests extends BaseRunner {

	@Test
	public void listoftrain() throws InterruptedException {

		Train_bookingPage arr = new Train_bookingPage(driver);
		arr.fromcityname(xl.getStringData(0, 0, 0));
		arr.searchTrain(xl.getStringData(0, 0, 0));
		log.info("slt from city");
		Thread.sleep(3000);
		arr.tocityname(xl.getStringData(0, 0, 1));
		arr.searchTrain(xl.getStringData(0, 0, 1));
		log.info("slt to city");
		Thread.sleep(6000);
		arr.dateselection();
		Thread.sleep(6000);
		arr.searchbutton();
		Thread.sleep(6000);
		System.out.println("===================");

		log.info("page loaded of trains");
		Display_Train dt = new Display_Train(driver);
		dt.sortclick();
		Thread.sleep(3000);
		dt.latefirst();
		Thread.sleep(3000);
		log.info("Duration Late first success");
		dt.trainlist();
		Thread.sleep(3000);
	}

	@Test
	public void topsgrid() throws InterruptedException {

		Train_bookingPage arr1 = new Train_bookingPage(driver);
		Thread.sleep(9000);
		String ouput = arr1.tabs(xl.getStringData(0, 0, 0));
		log.info(ouput);

	}

}
