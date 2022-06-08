package tsetngAssertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {


	WebDriver driver;
	@BeforeTest
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCase() throws InterruptedException
	{
		SoftAssert softAssert = new SoftAssert();
		String actualLoginTitle = driver.getTitle();

		softAssert.assertEquals(actualLoginTitle, "OrangeHRM");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebElement dashboard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statusOfDashboard = dashboard.isDisplayed();
		Assert.assertEquals(statusOfDashboard, true);
		Thread.sleep(4000);

		String actualHomepageTitle = driver.getTitle();
		softAssert.assertEquals(actualHomepageTitle, "OrangeHRMPage");
		Reporter.log("Create user", true);



	}





}
