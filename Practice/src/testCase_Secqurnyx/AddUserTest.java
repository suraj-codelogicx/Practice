package testCase_Secqurnyx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import target_Web_Page.AddUserPage;
import target_Web_Page.;

public void Property() throws InterruptedException {
	//launch browser
	
WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
	
	//created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	//call the method
	login_page.login_to_360("securnyx360@aol.com", "The360@2022");

	PropertyPage property_page = PageFactory.initElements(driver, PropertyPage.class);
	property_page.proprty_test();
	
	AddUserPage add_user_page = PageFactory.initElements(driver, AddUserPage.class);
	add_user_page.addUserTest();
	
}
