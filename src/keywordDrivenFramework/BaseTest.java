package keywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataDrivenFramework.Flib;

public class BaseTest {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		
		
		//read the data from property file i.e. key
		String browserKey = flib.readPropertyFile("./data/config.properties", "browser");
		
		//read the data from property file i.e. value		
		String url = flib.readPropertyFile("./data/config.properties", "chrome");
		
		
		
		if(url.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if(url.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else
		{
			System.out.println("Enter correct choice");
		}
		
		
		driver.quit();
		
		
	}

}
