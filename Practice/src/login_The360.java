import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_The360 {

    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
		"C:\\WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	// launching the specified URL
	driver.get("https://dev.the360.in/login");
	driver.manage().window().maximize();
	// driver.findElement(By.id("input-28"));
	// User Name field
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("surajbiswas@yopmail.com");
	// Password field
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("suraj8877");
	Thread.sleep(3000);
	// LOGIN field
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	// Quit from the browser.
	// driver.close();
	driver.quit();

    }

}
