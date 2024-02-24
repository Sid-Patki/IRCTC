package com.demo.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.reuseablemethods.HelperMethods;
import com.demo.uistore.Train_booking_ui;

public class Train_bookingPage extends HelperMethods {

	WebDriver driver;

	public Train_bookingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void fromcityname(String arrname) {
		WebElement fc = driver.findElement(Train_booking_ui.from_city_drp);
		fc.click();
		fc.sendKeys(arrname);
	}

	public void tocityname(String destname) {
		WebElement tc = driver.findElement(Train_booking_ui.to_city_drp);
		tc.clear();
		tc.sendKeys(destname);
	}

	public void searchTrain(String city) {
		List<WebElement> from = driver.findElements(Train_booking_ui.city_listdrp);

		for (int i = 0; i < from.size(); i++) {
			String c = from.get(i).getText();
			if (c.contains(city)) {
				from.get(i).click();
				break;
			}
		}

	}
	public void searchbutton() {
		driver.findElement(Train_booking_ui.train_search).click();
	}
	public void dateselection() throws InterruptedException {
		driver.findElement(Train_booking_ui.cal_firstclick).click();
		Thread.sleep(3000);

		//WebElement headermonth = driver.findElement(Train_booking_ui.month_header);

		//WebElement clickforward = driver.findElement(Train_booking_ui.forward_month_click);
		//System.out.println(headermonth.getText());
		while (!(driver.findElement(Train_booking_ui.month_header).getText()).contains("December2023")) {
			Thread.sleep(3000);
			driver.findElement(Train_booking_ui.forward_month_click).click();
		}
		List<WebElement> cal = driver.findElements(Train_booking_ui.cal_date);
		for (int i = 0; i <= cal.size(); i++) {
			String Date = cal.get(i).getText();
			if (Date.contains("2")) {
				cal.get(i).click();
				break;
			}
		}

	}
	public String tabs(String topgrid) {
		return drp1(Train_booking_ui.all_tabs, topgrid);
		
	}
	

}
