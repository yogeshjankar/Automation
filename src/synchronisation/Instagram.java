package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("9689524123");
		driver.findElement(By.name("password")).sendKeys("9689524123");;
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
	}

	}
