package tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenerio5 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.id("denyBtn")).click();


		WebElement mouseHover = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseHover).perform();

		driver.findElement(By.xpath("//a[.='Diamond' and @title='Diamond Rings']")).click();

		List<WebElement> list = driver.findElements(By.id("bst-discounted-price"));

		List<WebElement> priceList1 = list;
		for(WebElement priceList:priceList1)
		{
			String priceListText1 = priceList.getText();
			System.out.println(priceListText1);
		}

		System.out.println("========");

		WebElement dropdown = driver.findElement(By.xpath("//span[.=' Popular ']"));
		act.moveToElement(dropdown).perform();
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		
		List<WebElement> list1 = driver.findElements(By.id("bst-discounted-price"));
		List<WebElement> priceList2 = list1;
		for(WebElement priceList:priceList2)
		{
			String priceListText2 = priceList.getText();
			System.out.println(priceListText2);

		}
		
		



	}

}
