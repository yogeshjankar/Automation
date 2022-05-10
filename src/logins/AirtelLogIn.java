package logins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AirtelLogIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.airtel.in/s/selfcare?normalLogin");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("number-one")).sendKeys("987654321");
		driver.findElement(By.id("pasword")).sendKeys("123456789",Keys.ENTER);
	}

}
