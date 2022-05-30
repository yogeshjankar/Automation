package tasks;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser which you want to open");
		String browser = sc.nextLine();




		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/");
			driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple Watch");

			WebElement dropdown = driver.findElement(By.id("gh-cat"));
			Select sel = new Select(dropdown);
			sel.selectByVisibleText("Jewelry & Watches");
			driver.findElement(By.id("gh-btn")).click();		

		}

		else if(browser.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/");
			driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple Watch");

			WebElement dropdown = driver.findElement(By.id("gh-cat"));
			Select sel = new Select(dropdown);
			sel.selectByVisibleText("Jewelry & Watches");
			driver.findElement(By.id("gh-btn")).click();	

		}



	}

}
