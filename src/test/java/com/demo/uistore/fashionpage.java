package com.demo.uistore;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import automation.ebay.resuablemethod.helpermethods;
import automation.ebay.uistore.Loginpageobjectui;
import automation.ebay.uistore.Searchpageui;
import automation.ebay.uistore.fashionpageui;
import automation.ebay.pageobject.loginpageobject;

public class fashionpage extends helpermethods {

	WebDriver driver;

	public fashionpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void Backpack() throws InterruptedException, AWTException {
		
		loginpageobject log = new loginpageobject(driver);
		WebElement hoverfashion = driver.findElement(fashionpageui.fashionpagelink);
		Actions a = new Actions(driver);
		a.moveToElement(hoverfashion).perform();
		WebElement menacces = driver.findElement(fashionpageui.menaccesories);
		menacces.click();
		WebElement baglink = driver.findElement(fashionpageui.baglink);
		baglink.click();
		WebElement allfilters= driver.findElement(fashionpageui.filterlink);
		allfilters.click();
		WebElement backpack= driver.findElement(fashionpageui.Backpack);
		backpack.click();
		Thread.sleep(1000);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//WebElement apply= driver.findElement(fashionpageui.Apply);
	    click(fashionpageui.Apply, "click");
	}

	public void itemprice() throws InterruptedException {
		
		fashionpage fashionobject = new fashionpage(driver);
		searchpage searchobject = new searchpage(driver);
		WebElement firstitem = driver.findElement(fashionpageui.Firstelement);
		Thread.sleep(1000);
		firstitem.click();
		Set<String> handles= driver.getWindowHandles();/*resuable method*/
		Iterator it =handles.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		driver.switchTo().window(childid);
		
		String actual01= driver.findElement(fashionpageui.Carttitle).getText();
		String actual02= driver.findElement(fashionpageui.dollarvalue).getText();
		System.out.println(actual01);
		System.out.println(actual02);
		WebElement addtocart = driver.findElement(fashionpageui.addtocart);
		addtocart.click();
		String expected01= driver.findElement(fashionpageui.Carttitlecheckout).getText();
		String excpected02= driver.findElement(fashionpageui.dollarvaluecheckout).getText();
		System.out.println(expected01);
		System.out.println(excpected02);
		Assert.assertEquals( actual01,expected01 );
		Assert.assertEquals( actual02,excpected02 );
		WebElement checkout = driver.findElement(fashionpageui.gotocheckoutbutton);
		checkout.click();
		
		
		
		
	}
	
}
