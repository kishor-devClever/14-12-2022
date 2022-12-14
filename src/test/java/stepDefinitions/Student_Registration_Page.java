package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pages.Student_LogIn_Page_Objects;
import com.pages.Student_Register_Page_Objects;
import com.qa.factory.DriverFactory;

public class Student_Registration_Page {
	
	private Student_Register_Page_Objects lp = new Student_Register_Page_Objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Landing_Page.class);
}
