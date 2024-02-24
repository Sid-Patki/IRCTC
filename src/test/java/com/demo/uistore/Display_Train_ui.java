package com.demo.uistore;

import org.openqa.selenium.By;

public class Display_Train_ui {

public static By sortby_click =By.xpath("//button[@class='active btnDefault']");
public static By early_first =By.xpath("//div[contains(@class,'tb-pad')]//button[contains(@class,'btnDefault')]");
public static By late_first =By.xpath("//div[contains(@class,'tb-pad')]//button[contains(@class,'btnDefault')]");
//public static By train_result = By.xpath("(//div[contains(@class,'hidden-xs')]//span[@_ngcontent-grc-c102])[1]"); //error in path
public static By train_result =By.xpath("(//div[contains(@class,'tbis-div')]//div[contains(@class,'hidden-xs')])[1]");
}
