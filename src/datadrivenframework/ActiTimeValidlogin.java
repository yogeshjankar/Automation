package datadrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidlogin {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc:8080/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Flib flib = new Flib();
		// accessing reusable method
		
		
		String username = flib.readExcelData("./data/ActiTimeLoginData.xlsx", "validcreds", 1, 0);
		//read username from excel file
		
		
		String password = flib.readExcelData("./data/ActiTimeLoginData.xlsx", "validcreds", 1, 1);
		//read password from excel file
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}

}
