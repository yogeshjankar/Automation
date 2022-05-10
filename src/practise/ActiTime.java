package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc:8080/login.do");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[.='Create new tasks']")).click();
		
		
	}

}
