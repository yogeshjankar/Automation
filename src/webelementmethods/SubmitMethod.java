package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("yogesh");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456789");
		WebElement button = driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
		button.submit();

	}

}
