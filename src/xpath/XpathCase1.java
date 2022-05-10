package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		// Case 1 : xpath using unique attributes
		
		
		driver.findElement(By.xpath("//select[@title='Search in']")).click();
	}

}
