package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumApiDocsLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		driver.findElement(By.xpath("//p[.='Java']/ancestor::div[@class='card h-100 bg-transparent border-0']/descendant::a[.='API Docs']")).click();
	}

}
