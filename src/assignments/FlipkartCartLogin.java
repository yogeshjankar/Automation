package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCartLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.className("V3C5bO")).click();
		driver.findElement(By.xpath("//span[.='Login']")).click();

	}

}
