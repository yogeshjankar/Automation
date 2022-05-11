package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumCopyPasteAutomate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		Robot robot = new Robot();

		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Thread.sleep(2000);

		act.doubleClick(target).perform();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		driver.findElement(By.xpath("//input[@type='search']")).click();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);






	}

}
