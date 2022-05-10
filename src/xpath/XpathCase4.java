package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// 1. using or operator
		// Syntax : tagName[@Attr1='AV1' or @Attr1='AV1' or @Attrn='AVn']
		
		//driver.findElement(By.xpath(""))
	}

}
