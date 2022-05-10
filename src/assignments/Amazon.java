package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.id("q")).sendKeys("laptop");
		driver.findElement(By.className("L0Z3Pu")).click();
		
		
		
	}

}
