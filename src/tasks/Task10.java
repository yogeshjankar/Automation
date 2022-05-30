package tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

		driver.findElement(By.id("denyBtn")).click();
		WebElement frm = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		driver.findElement(By.id("name")).sendKeys("Aniket");
		driver.findElement(By.id("email")).sendKeys("aniket456@gmail.com");

		driver.findElement(By.id("6c5hjmu1o7c_146917605549304831")).sendKeys("9865412358");
		driver.findElement(By.xpath("//button[@class='lc-ncwcmf esv0owm2']")).click();
		
		

	}

}
