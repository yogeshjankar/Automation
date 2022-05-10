package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramWithFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.instagram.com");
		Thread.sleep(10000);
		driver.close();

	}

}
