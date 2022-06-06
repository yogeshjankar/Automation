package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);


		//this method return true if web element is enabled otherwise it will return false


		// values passes to web element to enable Log In button therefore it will return true

		WebElement usr = driver.findElement(By.name("username"));
		usr.sendKeys("vishal");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("987654321");

		WebElement loginButton = driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
		boolean buttonStatus = loginButton.isEnabled();
		System.out.println(buttonStatus);// true


		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		Thread.sleep(5000);		
		WebElement loginButton1 = driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
		
		boolean buttonStatus1 = loginButton1.isEnabled();
		System.out.println(buttonStatus1);// true
		
		
		
		

	}

}
