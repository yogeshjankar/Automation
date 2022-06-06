package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement textBox = driver.findElement(By.name("username"));
		boolean status = textBox.isDisplayed();
		System.out.println(status);  // it will return true if web element is diplayed.
		
		
		WebElement textBox1 = driver.findElement(By.name("username12"));
		boolean status1 = textBox1.isDisplayed();
		System.out.println(status1);  // it will return NoSuchElementException if web element is not displayed.
		
		
		
		
		
	}

}
