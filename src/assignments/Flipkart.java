package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(5000);

		String price = driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (Red, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		
		System.out.println(price);

	}

}
