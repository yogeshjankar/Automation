package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//xpath using contains()
		
		//Syntax 1 : tagName[contains(text(),'partOfTextValue')]
		driver.findElement(By.xpath("//a[contains(text(),'Fashion')]")).click();
		driver.navigate().back();
		
		//Syntax 2 : tagName[contains(@attributeName,'partOfAttributeValue')]
		driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
	}
}
