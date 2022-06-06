package scrollingoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// Scroll down
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(5000);
		
		// Scroll up	
		jse.executeScript("window.scrollBy(0,-1000)");
		
		
	}

}
