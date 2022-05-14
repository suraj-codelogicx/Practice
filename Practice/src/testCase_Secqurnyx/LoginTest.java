package testCase_Secqurnyx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import browserDriver.BrowserFactory;
import target_Web_Page.LoginPage;

public class LoginTest {

    @Test(groups = { "sanity" })
    public void checkLogin() throws InterruptedException {
	// launch browser

	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
	/*
	 * String log4jConfPath = "/path/to/log4j.properties";
	 * PropertyConfigurator.configure(log4jConfPath);
	 */

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("securnyx360@aol.com", "The360@2022");

    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	BrowserFactory.quit();
    }

}
