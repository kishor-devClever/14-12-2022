package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class School_or_Consortium_Account_Login_Page_Objects {
	private WebDriver driver;
	/* Constructor  */

	public School_or_Consortium_Account_Login_Page_Objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}