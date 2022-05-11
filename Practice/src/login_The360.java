import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_The360 {

    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
		"C:\\WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	// launching the specified URL
	driver.get("https://dev3215.uncoveredhc.com/v2/auth/login/");
	driver.manage().window().maximize();
	// driver.findElement(By.id("input-28"));
	// User Name field
	driver.findElement(By.id("input-26")).sendKeys("Admin");
	// Password field
	driver.findElement(By.id("input-28")).sendKeys("Pass@123");
	// Password X Path Finder

	// Deleting all the cookies
	driver.manage().deleteAllCookies();
	// Run until entered time period
	/*
	 * try { Thread.sleep(100);
	 * 
	 * } catch (InterruptedException e) { e.printStackTrace(); }
	 */
	// search_bar = driver.find_element_by_id("input-28");
	// Quit from the browser.
	driver.close();
	// driver.quit();
	/*
	 * public boolean verifySignInPageTitle() { String expectedTitle =
	 * "Sign in - Google Accounts"; return
	 * getSignInPageTitle().contains(expectedTitle }
	 */

    }

}
