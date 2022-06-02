package testCase_Secqurnyx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import target_Web_Page.LoginPage;
import target_Web_Page.PropertyFunctionalityPage;
import target_Web_Page.PropertyPage;

public class PropertyFunctionalityTest {

    @Test(groups = { "sanity" })
    public void Property() throws InterruptedException {
	// launch browser

	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("securnyx360@aol.com", "The360@2022");

	PropertyPage property_page = PageFactory.initElements(driver, PropertyPage.class);
	property_page.proprty_test();

	PropertyFunctionalityPage pf_page = PageFactory.initElements(driver, PropertyFunctionalityPage.class);
	pf_page.proprty_functionality_test();

    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	BrowserFactory.quit();
    }

}
