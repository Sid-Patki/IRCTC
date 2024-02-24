package com.demo.reuseablemethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperMethods {

	WebDriver driver;
	WebDriverWait wait;

	public HelperMethods(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void click(By path) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(path))).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void sendKeys(By path, Keys txt) {
		try {
			driver.findElement(path).sendKeys(txt);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void clickable(By path) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(path)).contextClick().build().perform();
	}

	public void drp(By path, String txt) {
		List<WebElement> lst = driver.findElements(path);

		for (int i = 0; i < lst.size(); i++) {
			String value = lst.get(i).getText();
			if (value.equals(txt)) {
				lst.get(i).click();
				break;

			}
		}
	}

	public String drp1(By path, String txt) {
		List<WebElement> lst = driver.findElements(path);
		String[] tb= txt.split(":");
        boolean tabs = false;
        String top="";
		for (int i = 0; i < lst.size(); i++) {
			String value = lst.get(i).getText();
			if (value.equals(tb)) {
             tabs=true;
			}
			top=top+" "+tb[i]+"_"+tabs;
		}
		return top;
	}
}