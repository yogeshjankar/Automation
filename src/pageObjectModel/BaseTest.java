package pageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyFile("./data/config.properties", "browser");
		String url = flib.readPropertyFile("./data/config.properties", "url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else
		{
			System.out.println("Enter correct choice");
		}
	}
	
	public void tearDown() {
		driver.close();
	}

}
