package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing_Page_Objects {

	private WebDriver driver;
	
	/* Page Objects */
	
	@FindBy(xpath = "//img[@alt='Launch Your Career']")
	WebElement navigation_Logo_top;

	@FindBy(xpath = "//a[@class='nav-link topNavLink active']")
	WebElement home_top;

	@FindBy(xpath = "//div[@id='navbarSupportedContent']//ul//a[text()='Students']")
	WebElement student_top;

	@FindBy(xpath = "//div[@id='navbarSupportedContent']//ul//a[text()='Educators']")
	WebElement educators_top;

	@FindBy(xpath = "//div[@id='navbarSupportedContent']//ul//a[text()='About Us']")
	WebElement about_us_top;

	@FindBy(xpath = "//div[@id='navbarSupportedContent']//ul//a[text()='Contact Us']")
	WebElement contacts_us_top;

	@FindBy(xpath = "//div[@id='navbarSupportedContent']//ul//a[text()='Sign up and take the quiz']")
	WebElement sign_up_and_take_the_quiz_top;

	@FindBy(xpath = "//*[@id='navbarDropdown']")
	WebElement countries_flag_top;

	@FindBy(xpath = "//*[text()='United Kingdom']")
	WebElement united_Kingdom_countries_flag;

	@FindBy(xpath = "//*[text()='United States']")
	WebElement united_States_countries_flag;

	@FindBy(xpath = "//*[text()='Canada']")
	WebElement canada_countries_flag;

	@FindBy(xpath = "//*[text()='India']")
	WebElement india_countries_flag;

	@FindBy(xpath = "//*[@id='navbarMenu']")
	WebElement sign_in_top;

	@FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right show']/a[@class='dropdown-item d-flex align-items-center'])[1]")
	WebElement sign_in_top_students;
	
	@FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right show']/a[@class='dropdown-item d-flex align-items-center'])[2]")
	WebElement sign_in_top_school_or_consortium;

	@FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right show']/a[@class='dropdown-item d-flex align-items-center'])[3]")
	WebElement sign_in_top_employer;

	@FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right show']/a[@class='dropdown-item d-flex align-items-center'])[4]")
	WebElement sign_in_top_college;

	@FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right show']/a[@class='dropdown-item d-flex align-items-center'])[5]")
	WebElement sign_in_top_VICTAR_code;

	@FindBy(xpath = "//*[@id='firstName']")
	WebElement first_name_user_field;

	@FindBy(xpath = "//*[@id='lastName']")
	WebElement last_name_user_field;

	@FindBy(xpath = "//*[@value='Sign Up & Take the Quiz!']")
	WebElement sign_up_and_take_the_quiz;

	@FindBy(xpath = "//*[@class='home_banner__card-solutions' and text()='Students']")
	WebElement students;

	@FindBy(xpath = "//*[@class='home_banner__card-solutions' and text()='School or Consortium']")
	WebElement school_or_consortium;

	@FindBy(xpath = "//*[@class='home_banner__card-solutions' and text()='Employers']")
	WebElement employers;

	@FindBy(xpath = "//*[@class='home_banner__card-solutions' and text()='College']")
	WebElement college;

	@FindBy(xpath = "//*[@class='home_banner__card-solutions' and text()='VICTAR Code']")
	WebElement VICTAR_code;

	@FindBy(xpath = "//div[@class='dropdown-arrow']")
	WebElement scroll_circle;

	@FindBy(xpath = "//div[@class='student_section__student mb-5 mb-lg-0']/*[@class='btn btn--primary btn--more pink-btn' ]")
	WebElement student_lets_go;

	@FindBy(xpath = "//div[@class='educator_section__educator']/*[@class='btn btn--primary btn--more pink-btn' ]")
	WebElement educators_lets_go;

	@FindBy(xpath = "//div[@class='footer-list']/ul/li/a[text()='Students']")
	WebElement footer_studetnts;

	@FindBy(xpath = "//div[@class='footer-list']//ul//a[text()='Educators']")
	WebElement footer_educators;

	@FindBy(xpath = "//*[text()='About us']")
	WebElement footer_about_us;

	@FindBy(xpath = "//*[text()='Contact us']")
	WebElement footer_contact_us;

	@FindBy(xpath = "//*[text()='Privacy & Cookie Policy']")
	WebElement footer_Privacy_and_Cookie_Policy;

	@FindBy(xpath = "//*[@id='_5282541_fb_social_media_facebook_facebook_logo_social_network_icon']")
	WebElement footer_facebook;

	@FindBy(xpath = "//*[@id='_5282551_tweet_twitter_twitter_logo_icon']")
	WebElement footer_twitter;

	@FindBy(xpath = "//*[@id='_5282544_camera_instagram_social_media_social_network_instagram_logo_icon']")
	WebElement footer_instagram;

	@FindBy(xpath = "//*[@id='_5282542_linkedin_network_social_network_linkedin_logo_icon']")
	WebElement footer_linkedIn;

	@FindBy(xpath = "//*[text()='Back to top']")
	WebElement footer_Back_to_top;
	
	@FindBy(xpath = "//*[@alt='LYC Icon']")
	WebElement register_to_landing_page;
	
	@FindBy(xpath = "//*[@alt='Launchyourcareer Logo']")
	WebElement student_to_landing_page;
	
	@FindBy(xpath = "//*[@alt='Launchyourcareer Logo']")
	WebElement school_or_consortium_to_landing_page;
	
	@FindBy(xpath = "//*[@alt='Launchyourcareer Logo']")
	WebElement employer_to_landing_page;

	@FindBy(xpath = "//*[@alt='Launchyourcareer Logo']")
	WebElement college_to_landing_page;
	
	@FindBy(xpath = "//*[@alt='Launchyourcareer Logo']")
	WebElement victar_to_landing_page;
	
	
	/* Constructor  */

	public Landing_Page_Objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	
	/* Methods */
	
	public boolean validation_on_navigation_logo_clickable_in_top() {
		return navigation_Logo_top.isEnabled();
	}
	
	public boolean validation_on_home_button_clickable_in_top() {
		return home_top.isEnabled();
	}
	
	public boolean validation_on_student_button_clickable_in_top() {
		return student_top.isEnabled();
	}
	
	public boolean validation_on_educators_button_clickable_in_top() {
		return educators_top.isEnabled();
	}
	
	public boolean validation_on_about_us_button_clickable_in_top() {
		return about_us_top.isEnabled();
	}
	
	public boolean validation_on_contact_us_button_clickable_in_top() {
		return contacts_us_top.isEnabled();
	}
	
	public boolean validation_on_sign_up_and_take_the_quiz_button_clickable_in_top() {
		return sign_up_and_take_the_quiz_top.isEnabled();
	}
	
	public boolean validation_on_main_flag_button_clickable_in_top() {
		return countries_flag_top.isEnabled();
	}
	
	public void click_on_Flag_button() {
		countries_flag_top.click();
	}
	
	public boolean validation_on_united_kingdom_flag_button_clickable_in_top() {
		return united_Kingdom_countries_flag.isEnabled();
	}
	
	public boolean validation_on_united_states_flag_button_clickable_in_top() {
		return united_States_countries_flag.isEnabled();
	}
	
	public boolean validation_on_canada_flag_button_clickable_in_top() {
		return canada_countries_flag.isEnabled();
	}
	
	public boolean validation_on_indian_flag_button_clickable_in_top() {
		return india_countries_flag.isEnabled();
	}
	
	public boolean validation_on_sign_button_clickable_in_top() {
		return sign_in_top.isEnabled();
	}
	
	public void click_on_sign_in_button() {
		sign_in_top.click();
	}
	
	public boolean validation_on_students_button_clickable_in_top() {
		return sign_in_top_students.isEnabled();
	}
	
	public boolean validation_on_school_or_consortium_button_clickable_in_top() {
		return sign_in_top_school_or_consortium.isEnabled();
	}
	
	public boolean validation_on_employers_button_clickable_in_top() {
		return sign_in_top_employer.isEnabled();
	}
	
	public boolean validation_on_college_button_clickable_in_top() {
		return sign_in_top_college.isEnabled();
	}
	
	public boolean validation_on_victar_code_button_clickable_in_top() {
		return sign_in_top_VICTAR_code.isEnabled();
	}
	
	public boolean validation_on_firstname_user_field_clickable() {
		return first_name_user_field.isEnabled();
	}
	
	public boolean validation_on_lastname_user_field_clickable() {
		return last_name_user_field.isEnabled();
	}
	
	public boolean validation_on_sign_up_and_take_the_quiz_clickable() {
		return sign_up_and_take_the_quiz.isEnabled();
	}
	
	public boolean validation_on_students_login_clickable() {
		return students.isEnabled();
	}
	
	public boolean validation_on_school_or_consortium_login_clickable() {
		return school_or_consortium.isEnabled();
	}
	
	public boolean validation_on_employers_login_clickable() {
		return employers.isEnabled();
	}
	
	public boolean validation_on_college_login_clickable() {
		return college.isEnabled();
	}
	
	public boolean validation_on_VICTAR_code_clickable() {
		return VICTAR_code.isEnabled();
	}
	
	public boolean validation_on_dropdown_arrow_clickable() {
		return scroll_circle.isEnabled();
	}
	
	public boolean validation_on_student_lets_go_clickable() {
		return student_lets_go.isEnabled();
	}
	
	public boolean validation_on_educators_lets_go_clickable() {
		return educators_lets_go.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_student_button_is_clickable(){
		return footer_studetnts.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_educators_button_is_clickable(){
		return footer_educators.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_about_us_button_is_clickable(){
		return footer_about_us.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_contact_us_button_is_clickable(){
		return footer_contact_us.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_Privacy_and_Cookie_Policy_button_is_clickable(){
		return footer_Privacy_and_Cookie_Policy.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_facebook_button_is_clickable(){
		return footer_facebook.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_twitter_button_is_clickable(){
		return footer_twitter.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_instagram_button_is_clickable(){
		return footer_instagram.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_linkedIn_button_is_clickable(){
		return footer_linkedIn.isEnabled();
	}
	public boolean validate_on_launch_your_career_footer_Back_to_top_button_is_clickable(){
		return footer_Back_to_top.isEnabled();
	}
	
	public void home_button_is_clicked_top(){
		home_top.click();
	}
	public String home_page_title() {
		return driver.getTitle();
	}
	public void student_button_is_clicked_top(){
		student_top.click();
	}
	public String student_page_title() {
		return driver.getTitle();
	}
	public void educators_button_is_clicked_top(){
		educators_top.click();
	}
	public String educators_page_title() {
		return driver.getTitle();
	}
	public void about_us_button_is_clicked_top(){
		about_us_top.click();
	}
	public String about_us_page_title() {
		return driver.getTitle();
	}
	public void contact_us_button_is_clicked_top(){
		contacts_us_top.click();
	}
	public String contacts_us_page_title() {
		return driver.getTitle();
	}
	public void sign_up_and_take_the_quiz_top_button_is_clicked_top(){
		sign_up_and_take_the_quiz_top.click();
	}
	public void reverse_from_register_to_landing_page() {
	register_to_landing_page.click();
	}
	public String sign_up_and_take_the_quiz_top_page_title() {
		return driver.getTitle();
	}
	public void united_Kingdom_countries_flag_top_button_is_clicked_top(){
		united_Kingdom_countries_flag.click();
	}
	public String united_Kingdom_countries_flag_top_page_title() {
		return driver.getTitle();
	}	
	public void united_states_countries_flag_button_is_clicked_top(){
		united_Kingdom_countries_flag.click();
	}
	public String united_states_countries_flag_page_title() {
		return driver.getTitle();
	}
	public void canada_countries_flag_button_is_clicked_top(){
		canada_countries_flag.click();
	}
	public String canada_countries_flag_page_title() {
		return driver.getTitle();
	}
	public void india_countries_flag_button_is_clicked_top(){
		india_countries_flag.click();
	}
	public String india_countries_flag_page_title() {
		return driver.getTitle();
	}
	public void sign_in_into_students_button_is_clicked_top(){
		sign_in_top_students.click();
	}
	public String sign_in_into_students_page_title() {
		return driver.getTitle();
	}
	public void reverse_from_student_to_landing_page() {
		student_to_landing_page.click();
	}
	public void sign_in_into_school_or_consortium_button_is_clicked_top(){
		sign_in_top_school_or_consortium.click();
	}
	public String sign_in_into_school_or_consortium_page_title() {
		return driver.getTitle();
	}
	public void reverse_from_school_or_consortium_to_landing_page() {
		school_or_consortium_to_landing_page.click();
	}
	public void sign_in_top_employer_button_is_clicked_top(){
		sign_in_top_employer.click();
	}
	public String sign_in_top_employer_page_title() {
		return driver.getTitle();
	}
	public void reverse_from_employer_to_landing_page() {
		employer_to_landing_page.click();
	}
	public void sign_in_top_college_button_is_clicked_top(){
		sign_in_top_college.click();
	}
	public String sign_in_top_college_page_title() {
		return driver.getTitle();
	}
	public void reverse_from_college_to_landing_page() {
		college_to_landing_page.click();
	}
	public void sign_in_top_victar_code_button_is_clicked_top(){
		sign_in_top_VICTAR_code.click();
	}
	public String sign_in_top_victar_code_page_title() {
		return driver.getTitle();
	}
	public void reverse_from_victar_to_landing_page() {
		victar_to_landing_page.click();
	}
	public void first_name_user_field_is_clicked_type_firstname(String firstname){
		first_name_user_field.click();
		first_name_user_field.sendKeys(firstname);
	}
	public void last_name_user_field_is_clicked_type_lastname(String lastname){
		last_name_user_field.click();
		last_name_user_field.sendKeys(lastname);
	}
	public void sign_up_and_take_the_quiz_button_is_click(){
		sign_up_and_take_the_quiz.submit();
	}
	public String sign_up_and_take_the_quiz_page_title() {
		return driver.getTitle();
	}
	public void students_button_is_clicks(){
		students.click();
	}
	public void school_or_consortium_button_is_clicks(){
		school_or_consortium.click();
	}
	public void employer_button_is_clicks(){
		employers.click();
	}
	public void college_button_is_clicks(){
		college.click();
	}
	public void victar_code_button_is_clicks(){
		VICTAR_code.click();
	}
	public void scroll_circle_button_is_clicks(){
		scroll_circle.click();
	}
	public void student_lets_go_button_is_clicks(){
		student_lets_go.click();
	}
	public void educators_lets_go_button_is_clicks(){
		educators_lets_go.click();
	}
	public void footer_studetnts_button_is_clicks(){
		footer_studetnts.click();
	}
	public void footer_educators_button_is_clicks(){
		footer_educators.click();
	}
	public void footer_about_us_button_is_clicks(){
		footer_about_us.click();
	}
	public void footer_contact_us_button_is_clicks(){
		footer_contact_us.click();
	}
	public void footer_Privacy_and_Cookie_Policy_button_is_clicks(){
		footer_Privacy_and_Cookie_Policy.click();
	}
	public void footer_facebook_button_is_clicks(){
		footer_facebook.click();
	}
	public void footer_twitter_button_is_clicks(){
		footer_twitter.click();
	}
	public void footer_instagram_button_is_clicks(){
		footer_instagram.click();
	}
	public void footer_linkedIn_button_is_clicks(){
		footer_linkedIn.click();
	}
	public void footer_Back_to_top_button_is_clicks(){
		footer_Back_to_top.click();
	}
	public String page_title() {
		return driver.getTitle();
	}
	public void backbutton() {
		driver.navigate().back();
	}
}