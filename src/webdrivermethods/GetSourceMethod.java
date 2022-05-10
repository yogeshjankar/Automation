package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/html/DynamicDropdown.html");
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);

	}

}
