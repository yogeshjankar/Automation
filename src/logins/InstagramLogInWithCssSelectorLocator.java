package logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogInWithCssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("987654321");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("button[class*='L3NKy ']")).click();

	}

}
