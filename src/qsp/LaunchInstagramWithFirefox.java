package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInstagramWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		driver.close();

	}

}
