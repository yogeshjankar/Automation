package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[@title='Rings' and .='Rings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();



	}

}
