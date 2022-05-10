package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogIn1{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc:8080/login.do");

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		

		String loginTitle = driver.getTitle();

		if(loginTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test case passed ! Login page title is matched");
		}
		else
			System.out.println("Test case failed ! Login page title is not matched");


		driver.findElement(By.name("username")).sendKeys("manager");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);

		
		String homePageTitle = driver.getTitle();

		if(homePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test case passed ! Home page title is matched ");
		}
		else
			System.out.println("Test case failed ! Home page title is not matched ");
	}

}
