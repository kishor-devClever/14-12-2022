package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pages.Employer_Account_Login_Page_Objects;
import com.qa.factory.DriverFactory;
public class Employer_Account_Login_Page {
	
	private Employer_Account_Login_Page_Objects lp = new Employer_Account_Login_Page_Objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Landing_Page.class);
}
