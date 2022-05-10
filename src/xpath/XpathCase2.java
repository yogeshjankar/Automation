package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		// Case 1 : xpath using text()
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}

}
