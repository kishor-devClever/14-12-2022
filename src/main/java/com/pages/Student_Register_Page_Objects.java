package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Student_Register_Page_Objects {
	private WebDriver driver;
	
	/* Constructor  */

	public Student_Register_Page_Objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
