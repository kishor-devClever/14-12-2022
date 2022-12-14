package stepDefinitions;

import org.apache.logging.log4j.*;
import org.junit.Assert;
import com.applicationHooks.AppHooks;
import com.pages.Landing_Page_Objects;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.*;

public class Landing_Page {

	private Landing_Page_Objects lp = new Landing_Page_Objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Landing_Page.class);

	@Given("^User is on the landing page$")
	public void user_is_on_the_landing_page() {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		logger.info("user_is_on_the_landing_page()"); // reflect into log file
		AppHooks.scn.log("user_is_on_the_landing_page() Test Case Successfull"); // reflect into pdf report
	}

	@Then("^Verify that navigation logo button is clickable in top navigation panel$")
	public void verify_that_navigation_logo_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_navigation_logo_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_navigation_logo_button_is_clickable()");
		AppHooks.scn
				.log("verify_that_navigation_logo_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that home button is clickable in top navigation panel$")
	public void verify_that_home_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_home_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_home_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_home_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that student button is clickable in top navigation panel$")
	public void verify_that_student_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_student_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_student_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_student_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that eductors button is clickable in top navigation panel$")
	public void verify_that_eductors_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_educators_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_eductors_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_eductors_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that about us button is clickable in top navigation panel$")
	public void verify_that_about_us_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_about_us_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_about_us_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_about_us_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that contact us button is clickable in top navigation panel$")
	public void verify_that_contact_us_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_contact_us_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_contact_us_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_contact_us_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that sign up and take the quiz button is clickable in top navigation panel$")
	public void verify_that_sign_up_and_take_the_quiz_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_sign_up_and_take_the_quiz_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_up_and_take_the_quiz_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_up_and_take_the_quiz_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that main flag is clickable in top navigation panel$")
	public void verify_that_main_flag_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_main_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_main_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_main_flag_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that flag into united kingdom flag is clickable in top navigation panel$")
	public void verify_that_flag_into_united_kingdom_flag_is_clickable_in_top_navigation_panel() {
		lp.click_on_Flag_button();
		boolean actual = lp.validation_on_united_kingdom_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_flag_into_united_kingdom_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_flag_into_united_kingdom_flag_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that flag into united states flag is clickable in top navigation panel$")
	public void verify_that_flag_into_united_states_flag_is_clickable_in_top_navigation_panel() {
		lp.click_on_Flag_button();
		boolean actual = lp.validation_on_united_states_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_flag_into_united_states_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_flag_into_united_states_flag_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that flag into canada flag is clickable in top navigation panel$")
	public void verify_that_flag_into_canada_flag_is_clickable_in_top_navigation_panel() {
		lp.click_on_Flag_button();
		boolean actual = lp.validation_on_canada_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_flag_into_canada_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn
				.log("verify_that_flag_into_canada_flag_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that flag into india flag is clickable in top navigation panel$")
	public void verify_that_flag_into_india_flag_is_clickable_in_top_navigation_panel() {
		lp.click_on_Flag_button();
		boolean actual = lp.validation_on_indian_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_flag_into_india_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn
				.log("verify_that_flag_into_india_flag_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that sign in button is clickable in top navigation panel$")
	public void verify_that_sign_in_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_sign_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_sign_in_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that sign in into students button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_students_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_students_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_students_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_students_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that sign in into school or consortium button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_school_or_consortium_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_school_or_consortium_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_school_or_consortium_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_school_or_consortium_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that sign in into employers button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_employers_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_employers_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_employers_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_employers_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that sign in into college button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_college_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_college_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_college_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_college_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that sign in into victar code button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_victar_code_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_victar_code_button_clickable_in_top();
		lp.click_on_sign_in_button();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_victar_code_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_victar_code_button_is_clickable_in_top_navigation_panel() Test Case Successfull");
	}

	@Then("^Verify that firstname user field is clickable$")
	public void verify_that_firstname_user_field_is_clickable() {
		boolean actual = lp.validation_on_firstname_user_field_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_firstname_user_field_is_clickable()");
		AppHooks.scn.log("verify_that_firstname_user_field_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that lastname user field is clickable$")
	public void verify_that_lastname_user_field_is_clickable() {
		boolean actual = lp.validation_on_lastname_user_field_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_lastname_user_field_is_clickable()");
		AppHooks.scn.log("verify_that_lastname_user_field_is_clickable() Test Case Successfull");
	}

	@Then("^verify that sign up and take the quiz button is clickable$")
	public void verify_that_sign_up_and_take_the_quiz_button_is_clickable() {
		boolean actual = lp.validation_on_sign_up_and_take_the_quiz_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_up_and_take_the_quiz_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_up_and_take_the_quiz_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that sign in into students button is clickable$")
	public void verify_that_sign_in_into_students_button_is_clickable() {
		boolean actual = lp.validation_on_students_login_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_students_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_students_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that sign in into school or consortium button is clickable$")
	public void verify_that_sign_in_into_school_or_consortium_button_is_clickable() {
		boolean actual = lp.validation_on_school_or_consortium_login_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_school_or_consortium_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_school_or_consortium_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that sign in into employers button is clickable$")
	public void verify_that_sign_in_into_employers_button_is_clickable() {
		boolean actual = lp.validation_on_employers_login_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_employers_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_employers_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that sign in into college button is clickable$")
	public void verify_that_sign_in_into_college_button_is_clickable() {
		boolean actual = lp.validation_on_college_login_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_college_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_college_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that sign in into victar code button is clickable$")
	public void verify_that_sign_in_into_victar_code_button_is_clickable() {
		boolean actual = lp.validation_on_VICTAR_code_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_victar_code_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_victar_code_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that dropdown arrow is clickable$")
	public void verify_that_dropdown_arrow_is_clickable() {
		boolean actual = lp.validation_on_dropdown_arrow_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_victar_code_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_victar_code_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that im student lets go button is clickable$")
	public void verify_that_im_student_lets_go_button_is_clickable() {
		boolean actual = lp.validation_on_student_lets_go_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_im_student_lets_go_button_is_clickable()");
		AppHooks.scn.log("verify_that_im_student_lets_go_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that im an eductor lets go button is clickable$")
	public void verify_that_im_an_eductor_lets_go_button_is_clickable() {
		boolean actual = lp.validation_on_educators_lets_go_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_im_an_eductor_lets_go_button_is_clickable()");
		AppHooks.scn.log("verify_that_im_an_eductor_lets_go_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that launch your career student button is clickable in footer$")
	public void verify_that_launch_your_career_student_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_student_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_launch_your_career_student_button_is_clickable_in_footer()");
		AppHooks.scn
				.log("verify_that_launch_your_career_student_button_is_clickable_in_footer() Test Case Successfull");
	}

	@Then("^verify that launch your career educator button is clickable in footer$")
	public void verify_that_launch_your_career_educator_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_educators_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_launch_your_career_educator_button_is_clickable_in_footer()");
		AppHooks.scn
				.log("verify_that_launch_your_career_educator_button_is_clickable_in_footer() Test Case Successfull");
	}

	@Then("^Verify that get in touch about us button is clickable in footer$")
	public void verify_that_get_in_touch_about_us_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_about_us_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_get_in_touch_about_us_button_is_clickable_in_footer()");
		AppHooks.scn.log("verify_that_get_in_touch_about_us_button_is_clickable_in_footer() Test Case Successfull");
	}

	@Then("^Verify that get in touch conatct us button is clickable in footer$")
	public void verify_that_get_in_touch_conatct_us_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_contact_us_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_get_in_touch_conatct_us_button_is_clickable_in_footer()");
		AppHooks.scn.log("verify_that_get_in_touch_conatct_us_button_is_clickable_in_footer() Test Case Successfull");
	}

	@Then("^Verify that privacy & cookie policy button is clickable in footer$")
	public void verify_that_privacy_cookie_policy_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_Privacy_and_Cookie_Policy_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_privacy_cookie_policy_button_is_clickable_in_footer()");
		AppHooks.scn.log("verify_that_privacy_cookie_policy_button_is_clickable_in_footer() Test Case Successfull");
	}

	@Then("^Verify that back to top button is clickable in footer$")
	public void verify_that_back_to_top_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_Back_to_top_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_back_to_top_button_is_clickable_is_clickable_in_footer()");
		AppHooks.scn.log("verify_that_back_to_top_button_is_clickable_is_clickable_in_footer() Test Case Successfull");
	}

	@Then("^Verify that keep up with all things careers facebook button is clickable$")
	public void verify_that_keep_up_with_all_things_careers_facebook_button_is_clickable() {
		boolean actual = lp.validate_on_launch_your_career_footer_facebook_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_keep_up_with_all_things_careers_facebook_button_is_clickable()");
		AppHooks.scn.log(
				"verify_that_keep_up_with_all_things_careers_facebook_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that keep up with all things careers twitter button is clickable$")
	public void verify_that_keep_up_with_all_things_careers_twitter_button_is_clickable() {
		boolean actual = lp.validate_on_launch_your_career_footer_twitter_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_keep_up_with_all_things_careers_twitter_button_is_clickable()");
		AppHooks.scn
				.log("verify_that_keep_up_with_all_things_careers_twitter_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that keep up with all things careers instagram button is clickable$")
	public void verify_that_keep_up_with_all_things_careers_instagram_button_is_clickable() {
		boolean actual = lp.validate_on_launch_your_career_footer_instagram_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_keep_up_with_all_things_careers_instagram_button_is_clickable()");
		AppHooks.scn.log(
				"verify_that_keep_up_with_all_things_careers_instagram_button_is_clickable() Test Case Successfull");
	}

	@Then("^Verify that keep up with all things careers linkedIn button is clickable$")
	public void verify_that_keep_up_with_all_things_careers_linkedin_button_is_clickable() {
		boolean actual = lp.validate_on_launch_your_career_footer_instagram_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_keep_up_with_all_things_careers_linkedin_button_is_clickable()");
		AppHooks.scn.log(
				"verify_that_keep_up_with_all_things_careers_linkedin_button_is_clickable() Test Case Successfull");
	}

	/*
	 * Scenario number=02
	 */

//	@When("^User click on the home button function in top navigation panel$")
//	public void user_click_on_the_home_button_function_in_top_navigation_panel() {
//		lp.home_button_is_clicked_top();
//		logger.info("user_click_on_the_home_function()");
//		AppHooks.scn.log("user_click_on_the_home_function() Test Case Successfull");
//	}
//
//	@Then("verify that home button working as expected with page title {string}")
//	public void verify_that_home_button_working_as_expected_with_page_title_something(String strArg1) {
//		String home_title = lp.home_page_title();
//		boolean actual = home_title.contains(strArg1);
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_home_button_working_as_expected_something()");
//		AppHooks.scn.log("verify_that_home_button_working_as_expected_something() Test Case Successfull");
//	}
//
//	@When("^User click on student button function in top navigation panel$")
//	public void user_click_on_student_button_function_in_top_navigation_panel() {
//		lp.student_button_is_clicked_top();
//		logger.info("user_click_on_the_home_function()");
//		AppHooks.scn.log("user_click_on_the_home_function() Test Case Successfull");
//	}
//
//	@Then("verify that students button working as expected with page title {string}")
//	public void verify_that_students_button_working_as_expected_with_page_title_something(String strArg2) {
//		String student_title = lp.student_page_title();
//		boolean actual = student_title.contains(strArg2);
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_students_button_working_as_expected_something()");
//		AppHooks.scn.log("verify_that_students_button_working_as_expected_something() Test Case Successfull");
//	}
//
//	@When("^User click on educators button function in top navigation panel$")
//	public void user_click_on_educators_button_function_in_top_navigation_panel() {
//		lp.educators_button_is_clicked_top();
//		logger.info("user_click_on_educators_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log("user_click_on_educators_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that educators button working as expected with page title {string}")
//	public void verify_that_educators_button_working_as_expected_with_page_title_something(String strArg1) {
//		String educators_title = lp.educators_page_title();
//		boolean actual = educators_title.contains(strArg1);
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_educators_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_educators_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on About Us button function in top navigation panel$")
//	public void user_click_on_about_us_button_function_in_top_navigation_panel() {
//		lp.about_us_button_is_clicked_top();
//		logger.info("user_click_on_about_us_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log("user_click_on_about_us_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that about us button working as expected with page title {string}")
//	public void then_verify_that_about_us_button_working_as_expected_with_page_title_something(String strArg1) {
//		String educators_title = lp.about_us_page_title();
//		boolean actual = educators_title.contains(strArg1);
//		Assert.assertEquals(actual, true);
//		logger.info("then_verify_that_about_us_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"then_verify_that_about_us_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on contact us button function in top navigation panel$")
//	public void user_click_on_contact_us_button_function_in_top_navigation_panel() {
//		lp.contact_us_button_is_clicked_top();
//		logger.info("user_click_on_contact_us_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log("user_click_on_contact_us_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that contact us button working as expected with page title {string}")
//	public void verify_that_contact_us_button_working_as_expected_with_page_title_something(String strArg1) {
//		String contact_title = lp.contacts_us_page_title();
//		boolean actual = contact_title.contains(strArg1);
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_contact_us_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_contact_us_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on sign up & take the quiz button function in top navigation panel$")
//	public void user_click_on_sign_up_take_the_quiz_button_function_in_top_navigation_panel() {
//		lp.sign_up_and_take_the_quiz_top_button_is_clicked_top();
//		logger.info("user_click_on_sign_up_take_the_quiz_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log(
//				"user_click_on_sign_up_take_the_quiz_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that sign up & take the quiz button working as expected with page title {string}")
//	public void verify_that_sign_up_take_the_quiz_button_working_as_expected_with_page_title_something(String strArg1) {
//		String sign_up_take_the_quiz_title = lp.sign_up_and_take_the_quiz_top_page_title();
//		boolean actual = sign_up_take_the_quiz_title.contains(strArg1);
//		lp.reverse_from_register_to_landing_page();
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_sign_up_take_the_quiz_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_sign_up_take_the_quiz_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on flag into united kingdom button function in top navigation panel$")
//	public void user_click_on_flag_into_united_kingdom_button_function_in_top_navigation_panel() {
//		lp.click_on_Flag_button();
//		lp.united_Kingdom_countries_flag_top_button_is_clicked_top();
//		logger.info("user_click_on_flag_into_united_kingdom_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log(
//				"user_click_on_flag_into_united_kingdom_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that flag into united kingdom button working as expected with page title {string}")
//	public void verify_that_flag_into_united_kingdom_button_working_as_expected_with_page_title_something(
//			String strArg1) {
//		String flag_into_united_kingdom_title = lp.united_Kingdom_countries_flag_top_page_title();
//		boolean actual = flag_into_united_kingdom_title.contains(strArg1);
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_flag_into_united_kingdom_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_flag_into_united_kingdom_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on flag into united states button function in top navigation panel$")
//	public void user_click_on_flag_into_united_states_button_function_in_top_navigation_panel() {
//		lp.click_on_Flag_button();
//		lp.united_states_countries_flag_button_is_clicked_top();
//		logger.info("user_click_on_flag_into_united_states_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log(
//				"user_click_on_flag_into_united_states_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that flag into united states button working as expected with page title {string}")
//	public void verify_that_flag_into_united_states_button_working_as_expected_with_page_title_something(
//			String strArg1) {
//		String flag_into_united_states_title = lp.united_states_countries_flag_page_title();
//		boolean actual = flag_into_united_states_title.contains(strArg1);
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_flag_into_united_states_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_flag_into_united_states_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on flag into canada button function in top navigation panel$")
//	public void user_click_on_flag_into_canada_button_function_in_top_navigation_panel() {
//		lp.click_on_Flag_button();
//		lp.canada_countries_flag_button_is_clicked_top();
//		logger.info("user_click_on_flag_into_canada_button_function_in_top_navigation_panel()");
//		AppHooks.scn
//				.log("user_click_on_flag_into_canada_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that flag into canada button working as expected with page title {string}")
//	public void verify_that_flag_into_canada_button_working_as_expected_with_page_title_something(String strArg1) {
//		String flag_into_canada_title = lp.canada_countries_flag_page_title();
//		boolean actual = flag_into_canada_title.contains(strArg1);
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_flag_into_canada_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_flag_into_canada_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on flag into india button function in top navigation panel$")
//	public void user_click_on_flag_into_india_button_function_in_top_navigation_panel() {
//		lp.click_on_Flag_button();
//		lp.india_countries_flag_button_is_clicked_top();
//		logger.info("user_click_on_flag_into_india_button_function_in_top_navigation_panel()");
//		AppHooks.scn
//				.log("user_click_on_flag_into_india_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that flag into india button working as expected with page title {string}")
//	public void verify_that_flag_into_india_button_working_as_expected_with_page_title_something(String strArg1) {
//		String flag_into_india_title = lp.india_countries_flag_page_title();
//		boolean actual = flag_into_india_title.contains(strArg1);
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_flag_into_india_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_flag_into_india_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on sign up into students button function in top navigation panel$")
//	public void user_click_on_sign_up_into_students_button_function_in_top_navigation_panel() {
//		lp.click_on_sign_in_button();
//		lp.sign_in_into_students_button_is_clicked_top();
//		logger.info("user_click_on_sign_up_into_students_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log(
//				"user_click_on_sign_up_into_students_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that sign up into students button working as expected with page title {string}")
//	public void verify_that_sign_up_into_students_button_working_as_expected_with_page_title_something(String strArg1) {
//		String students_title = lp.sign_in_into_students_page_title();
//		boolean actual = students_title.contains(strArg1);
//		lp.reverse_from_student_to_landing_page();
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_sign_up_into_students_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_sign_up_into_students_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on sign up into school or consortium button function in top navigation panel$")
//	public void user_click_on_sign_up_into_school_or_consortium_button_function_in_top_navigation_panel() {
//		lp.click_on_sign_in_button();
//		lp.sign_in_into_school_or_consortium_button_is_clicked_top();
//		logger.info("user_click_on_sign_up_into_school_or_consortium_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log(
//				"user_click_on_sign_up_into_school_or_consortium_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that sign up into school or consortium button working as expected with page title {string}")
//	public void verify_that_sign_up_into_school_or_consortium_button_working_as_expected_with_page_title_something(
//			String strArg1) {
//		String school_or_consortium_title = lp.sign_in_into_school_or_consortium_page_title();
//		System.out.println(school_or_consortium_title);
//		boolean actual = school_or_consortium_title.contains(strArg1);
//		lp.reverse_from_school_or_consortium_to_landing_page();
//		Assert.assertEquals(actual, true);
//		logger.info(
//				"verify_that_sign_up_into_school_or_consortium_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_sign_up_into_school_or_consortium_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on sign up into employer button function in top navigation panel$")
//	public void user_click_on_sign_up_into_employer_button_function_in_top_navigation_panel() {
//		lp.click_on_sign_in_button();
//		lp.sign_in_top_employer_button_is_clicked_top();
//		logger.info("user_click_on_sign_up_into_employer_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log(
//				"user_click_on_sign_up_into_employer_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that sign up into employer button working as expected with page title {string}")
//	public void verify_that_sign_up_into_employer_button_working_as_expected_with_page_title_something(String strArg1) {
//		String employer_title = lp.sign_in_into_school_or_consortium_page_title();
//		boolean actual = employer_title.contains(strArg1);
//		lp.reverse_from_employer_to_landing_page();
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_sign_up_into_employer_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_sign_up_into_employer_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on sign up into college button function in top navigation panel$")
//	public void user_click_on_sign_up_into_college_button_function_in_top_navigation_panel() {
//		lp.click_on_sign_in_button();
//		lp.sign_in_top_college_button_is_clicked_top();
//		logger.info("user_click_on_sign_up_into_college_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log(
//				"user_click_on_sign_up_into_college_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that sign up into college button working as expected with page title {string}")
//	public void verify_that_sign_up_into_college_button_working_as_expected_with_page_title_something(String strArg1) {
//		String college_title = lp.sign_in_top_college_page_title();
//		boolean actual = college_title.contains(strArg1);
//		lp.reverse_from_college_to_landing_page();
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_sign_up_into_college_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log(
//				"verify_that_sign_up_into_college_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click on sign up into victar code login button function in top navigation panel$")
//	public void user_click_on_sign_up_into_victar_code_login_button_function_in_top_navigation_panel() {
//		lp.click_on_sign_in_button();
//		lp.sign_in_top_victar_code_button_is_clicked_top();
//		logger.info("user_click_on_sign_up_into_victar_code_login_button_function_in_top_navigation_panel()");
//		AppHooks.scn.log(
//				"user_click_on_sign_up_into_victar_code_login_button_function_in_top_navigation_panel() Test Case Successfull");
//	}
//
//	@Then("verify that sign up into victar code login button working as expected with page title {string}")
//	public void verify_that_sign_up_into_victar_code_login_button_working_as_expected_with_page_title_something(String strArg1) {
//		String college_title = lp.sign_in_top_victar_code_page_title();
//		boolean actual = college_title.contains(strArg1);
//		lp.reverse_from_victar_to_landing_page();
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_sign_up_into_victar_code_login_button_working_as_expected_with_page_title_something()");
//		AppHooks.scn.log("verify_that_sign_up_into_victar_code_login_button_working_as_expected_with_page_title_something() Test Case Successfull");
//	}
//
//	@When("^User click in first name field and last name field and send text data into those field$")
//	public void user_click_in_first_name_field_and_last_name_field_and_send_text_data_into_those_field() {
//		lp.first_name_user_field_is_clicked_type_firstname(AppHooks.prop.getProperty("firstname"));
//		lp.last_name_user_field_is_clicked_type_lastname(AppHooks.prop.getProperty("lastname"));
//		lp.sign_up_and_take_the_quiz_button_is_click();
//		logger.info("user_click_in_first_name_field_and_last_name_field_and_send_text_data_into_those_field()");
//		AppHooks.scn.log("user_click_in_first_name_field_and_last_name_field_and_send_text_data_into_those_field() Test Case Successfull");
//	}
//
//	@Then("Verify that user is able to navigate into the register page {string}")
//	public void verify_that_user_is_able_to_navigate_into_the_register_page(String strarg1) {
//		String sign_up_and_take_the_quiz_title=lp.sign_up_and_take_the_quiz_page_title();
//		boolean actual = sign_up_and_take_the_quiz_title.contains(strarg1);
//		lp.reverse_from_register_to_landing_page();
//		Assert.assertEquals(actual, true);
//		logger.info("verify_that_user_is_able_to_navigate_into_the_register_page()");
//		AppHooks.scn.log("verify_that_user_is_able_to_navigate_into_the_register_page() Test Case Successfull");
//	}
	
	
	
	 @When("^User click on students button function in top navigation panel from banner$")
	    public void user_click_on_students_button_function_in_top_navigation_panel_from_banner()  {
	       
	    }

	    @When("^User click on school or consortium button function in top navigation panel from banner$")
	    public void user_click_on_school_or_consortium_button_function_in_top_navigation_panel_from_banner()  {
	       
	    }

	    @When("^User click on employer button function in top navigation panel from banner$")
	    public void user_click_on_employer_button_function_in_top_navigation_panel_from_banner()  {
	       
	    }

	    @When("^User click on college button function in top navigation panel from banner$")
	    public void user_click_on_college_button_function_in_top_navigation_panel_from_banner()  {
	       
	    }

	    @When("^User click on victar code login button function in top navigation panel from banner$")
	    public void user_click_on_victar_code_login_button_function_in_top_navigation_panel_from_banner()  {
	       
	    }

	    @Then("verify that students button working as expected with page title {string} from banner")
	    public void verify_that_students_button_working_as_expected_with_page_title_something(String strArg1)  {
	       
	    }

	    @Then("verify that school or consortium button working as expected with page title {string} from banner")
	    public void verify_that_school_or_consortium_button_working_as_expected_with_page_title_something_from_banner(String strArg1)  {
	       
	    }

	    @Then("verify that employer button working as expected with page title {string} from banner")
	    public void verify_that_employer_button_working_as_expected_with_page_title_something_from_banner(String strArg1)  {
	       
	    }

	    @Then("verify that college button working as expected with page title {string} from banner")
	    public void verify_that_college_button_working_as_expected_with_page_title_something_from_banner(String strArg1)  {
	       
	    }

	    @Then("verify that victar code login button working as expected with page title {string} from banner")
	    public void verify_that_victar_code_login_button_working_as_expected_with_page_title_something_from_banner(String strArg1)  {
	       
	    }

	
	

}