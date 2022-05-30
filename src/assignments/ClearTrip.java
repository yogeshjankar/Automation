package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);



		//		driver.findElement(By.xpath("//div[contains(@class,'hover:bg-neutral')]")).click();
		WebElement textField = driver.findElement(By.xpath("//input[contains(@class,'br-4 h-8 null')]"));
		textField.sendKeys("Pune");
		Thread.sleep(30);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);




	}
}
