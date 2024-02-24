package com.demo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.reuseablemethods.HelperMethods;
import com.demo.uistore.Display_Train_ui;

public class Display_Train extends HelperMethods {

	WebDriver driver;

	public Display_Train(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void sortclick() {
		WebElement md = driver.findElement(Display_Train_ui.sortby_click);
		md.click();
	}

//      public void earlyfirst() {
//    	  WebElement lt =driver.findElement(Display_Train_ui.early_first);
//          lt.click();
//      }
	public void latefirst() {
		drp(Display_Train_ui.late_first, "DurationLate First");
	}

	public void trainlist() {
	WebElement list = 	driver.findElement(Display_Train_ui.train_result);
	//list.getText();
	System.out.println(list.getText());
	}

}
