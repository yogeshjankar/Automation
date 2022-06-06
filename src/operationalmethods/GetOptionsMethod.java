package operationalmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/html/MultiSelectDropdown.html");
		Thread.sleep(5000);

		WebElement elementDropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(elementDropdown);
		List<WebElement> options = sel.getOptions();

		for(int i=0;i<=options.size();i++) 
		{
			WebElement option = options.get(i);
			String value = option.getText();
			System.out.println(value);
		}


	}
}
