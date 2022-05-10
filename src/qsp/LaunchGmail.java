package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
	}

}
