package synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLogInExplicitWait{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc:8080/login.do");

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);



		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));



		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println("Login page title is matched");




		driver.findElement(By.name("username")).sendKeys("manager");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);


		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println("Home page title is matched");

	}

}
