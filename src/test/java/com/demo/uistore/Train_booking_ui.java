package com.demo.uistore;

import org.openqa.selenium.By;

public class Train_booking_ui {

	
	public static By from_city_drp=By.xpath("//input[@aria-controls=\"pr_id_1_list\"]");
	public static By to_city_drp=By.xpath("//input[@aria-controls=\"pr_id_2_list\"]");
	public static By city_listdrp=By.xpath("//ul[contains(@class,'ui-autocomplete-items')]//li");
	public static By train_search=By.xpath("//button[@class='search_btn train_Search']");
	public static By cal_firstclick=By.xpath("//span[contains(@class,'calendar')]//input");
	public static By forward_month_click=By.xpath("//a[contains(@class,'ui-datepicker-next')]");
	public static By month_header = By.xpath("//div[contains(@class,'ui-datepicker-title')]");
	public static By cal_date= By.xpath("//a[contains(@class,'ui-state-default ng-tns-c58-10 ng-star-inserted')]");
	public static By all_tabs=By.xpath("li[contains(@class,'menu-list header-icon-menu')]");
	
}
