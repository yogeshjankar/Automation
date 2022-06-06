package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		WebElement loc = driver.findElement(By.xpath("//h2[.='News']"));
		Point printLoc = loc.getLocation();
		int xaxis = printLoc.getX();
		int yaxis = printLoc.getY();
		System.out.println("X-axis : "+xaxis);
		System.out.println("Y-axis : "+yaxis);
	}

}
