package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/html/Login.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("n1")).sendKeys("admin");     // types username in username text field
		driver.findElement(By.name("n2")).sendKeys("admin123");  // types password in password text field

	}

}
