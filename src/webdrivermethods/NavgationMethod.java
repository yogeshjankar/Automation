package webdrivermethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavgationMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("linkdin",Keys.ENTER);
		Thread.sleep(8000);
		
		driver.navigate().back();
		Thread.sleep(8000);
		
		driver.navigate().forward();
		Thread.sleep(8000);
		
		driver.navigate().refresh();
	}

}
