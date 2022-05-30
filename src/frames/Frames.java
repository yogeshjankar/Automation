package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(5000);
		//WebElement target = driver.findElement(By.xpath("//iframe[@id='webengage-engagement-callback-frame']"));
		driver.switchTo().frame("webengage-engagement-callback-frame");






	}

}
