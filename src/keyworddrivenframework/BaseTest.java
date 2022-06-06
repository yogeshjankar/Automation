package keyworddrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import datadrivenframework.Flib;

public class BaseTest implements IAutoConstant {
	
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		
		
		//read the data from property file i.e. key
		String browserValue = flib.readPropertyFile(PROP_PATH, "browser");
		
		//read the data from property file i.e. value		
		String url = flib.readPropertyFile(PROP_PATH, "url");
		
		
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else
		{
			System.out.println("Enter correct choice");
		}
	}
		
		public void closeBrowser()
		{
			driver.close();
		}
		
		
	}


