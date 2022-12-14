package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pages.College_Account_Login_Page_Objects;
import com.pages.Student_LogIn_Page_Objects;
import com.qa.factory.DriverFactory;

public class College_Account_Login_Page {
	
	private College_Account_Login_Page_Objects  lp = new College_Account_Login_Page_Objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Landing_Page.class);
}
