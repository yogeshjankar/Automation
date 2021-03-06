package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc:8080/login.do");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement unTextBox = driver.findElement(By.name("username"));
		WebElement passTextBox = driver.findElement(By.name("pwd"));
		
		
		String attr1 = unTextBox.getAttribute("class");
		String attr2 = passTextBox.getAttribute("name");
		
		System.out.println(attr1);
		System.out.println(attr2);
		
		
	}

}
