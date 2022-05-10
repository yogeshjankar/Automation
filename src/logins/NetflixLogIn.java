package logins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/Login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("123456789");
		driver.findElement(By.id("id_password")).sendKeys("123456789",Keys.ENTER);
		//driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
	}

}
