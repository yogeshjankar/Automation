package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		Rectangle rect = news.getRect();
		int width = rect.getWidth();
		int height = rect.getHeight();
		
		System.out.println("width : "+width);
		System.out.println("height : "+height);
		

	}

}
