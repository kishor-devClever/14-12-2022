package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Activate_Your_VICTAR_Code_Page_Objects {
	private WebDriver driver;
	
	/* Constructor  */

	public Activate_Your_VICTAR_Code_Page_Objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}