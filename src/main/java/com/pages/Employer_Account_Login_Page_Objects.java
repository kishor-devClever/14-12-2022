package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Employer_Account_Login_Page_Objects {
	private WebDriver driver;
	
	/* Constructor  */

	public Employer_Account_Login_Page_Objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
