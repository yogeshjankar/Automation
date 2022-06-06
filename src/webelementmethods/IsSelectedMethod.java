package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc:8080/login.do");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 
		// it will return true if web element is selected otherwise it returns false
		
		
		// check box not selected
		WebElement checkBox = driver.findElement(By.name("remember"));
		boolean status = checkBox.isSelected();
		System.out.println(status); //false


		
	}

}
