package webdrivermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodForEachLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(5000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));

		//using advance for loop

		for(WebElement suggestions:suggestion) {
			String sugg = suggestions.getText();
			System.out.println(sugg);
		}

	}
}
