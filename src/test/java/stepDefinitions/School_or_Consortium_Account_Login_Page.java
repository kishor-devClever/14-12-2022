package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pages.Student_LogIn_Page_Objects;
import com.qa.factory.DriverFactory;

public class School_or_Consortium_Account_Login_Page {
	
	private Student_LogIn_Page_Objects lp = new Student_LogIn_Page_Objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Landing_Page.class);
}
