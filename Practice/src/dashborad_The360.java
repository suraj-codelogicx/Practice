import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dashborad_The360 {

    // @SuppressWarnings("deprecation")
    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
		"C:\\WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// driver.get("https://dev.the360.in/login");
	driver.manage().window().maximize();
	driver.get("https://dev.the360.in/login");
	Thread.sleep(4000);
	// Login to The360
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("surajbiswas@yopmail.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("suraj8877");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@name='button'])[2]")).click();
	Thread.sleep(4000);
	//
	driver.findElement(By
		.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[3]/ul[1]/li[1]/a[1]"))
		.click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//a[normalize-space()='Flat Owners']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]"))
		.click();
	Thread.sleep(6000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[4]/span[1]"))
		.click();
	Thread.sleep(6000);

	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/button[1]"))
		.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"))
		.sendKeys("Soham");
	Thread.sleep(4000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]"))
		.sendKeys("Dutta");
	Thread.sleep(4000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]"))
		.sendKeys("duttasoham20@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]"))
		.sendKeys("7980395774");
	Thread.sleep(4000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]"))
		.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[3]/ul[1]/li[1]/span[1]"))
		.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/label[1]/span[1]"))
		.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(
		"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/input[1]"))
		.sendKeys("teacher");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(4000);

	driver.findElement(By.xpath("//*[@class='user-image circle-image']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[normalize-space()='Sign out']")).click();
	Thread.sleep(6000);

	driver.close();

    }

}
