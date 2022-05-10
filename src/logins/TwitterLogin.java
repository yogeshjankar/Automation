package logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("bharatshinde");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bharat123456");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	}

}
