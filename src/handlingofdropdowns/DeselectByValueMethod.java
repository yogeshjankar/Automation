package handlingofdropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValueMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/html/MultiSelectDropdown.html");
		Thread.sleep(5000);
		
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);
		sel.selectByVisibleText("Paratha");
		Thread.sleep(5000);
		sel.deselectByValue("v10");
	}
}
