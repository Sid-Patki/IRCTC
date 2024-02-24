package com.demo.uistore;

import org.openqa.selenium.By;

public class fashionpageui {
	
public static By fashionpagelink = By.xpath("/html[1]/body[1]/div[5]/div[1]/ul[1]/li[5]/a[1]");
public static By menaccesories = By.xpath("/html[1]/body[1]/div[5]/div[1]/ul[1]/li[5]/div[2]/div[1]/nav[2]/ul[1]/li[1]/a[1]");
public static By baglink = By.xpath("/html/body/div[3]/div[3]/div[3]/div[1]/section[1]/div[2]/div/div/ul/li[3]/a/p");
public static By filterlink = By.xpath("//button[@aria-label='All Filters']");
public static By Backpack = By.xpath("//input[@id=\"c3-subPanel-Style_Backpack_cbx\"]");	
public static By Apply = By.xpath("//button[normalize-space()='Apply']");
public static By Firstelement = By.xpath("/html[1]/body[1]/div[3]/div[3]/div[3]/section[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/div[1]");
public static By Carttitle = By.xpath("//h1[@Class='x-item-title__mainTitle']");
public static By dollarvalue = By.xpath("//div[@Class='x-price-primary']");
public static By Carttitlecheckout = By.xpath("//h3[@class='item-title text-truncate-multiline black-link lines-2']");
public static By dollarvaluecheckout = By.xpath("(//span[@class='text-display-span'])[6]");
public static By gotocheckoutbutton = By.xpath("//button[@class='btn btn--primary btn--large']");
public static By addtocart = By.xpath("//span[contains(text(),'Add to cart')]");
}


