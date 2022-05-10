package handlingOfDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMultipleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/html/MultiSelectDropdown.html");
		Thread.sleep(5000);
		

		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);
		for(int i=2;i<=7;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(4000);
		}
		sel.deselectAll();

	}
}
