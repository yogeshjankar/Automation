package datadrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc:8080/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Flib flib = new Flib();
		int count = flib.getRowCount("./data/ActiTimeLoginData.xlsx", "invalidcreds");
		
		for(int i=1;i<=count;i++)
		{
			String username = flib.readExcelData("./data/ActiTimeLoginData.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./data/ActiTimeLoginData.xlsx", "invalidcreds", i, 1);
			
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			
			
			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();
			
			
			
		}
	}

}
