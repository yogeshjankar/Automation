package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramWithChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(8000);
		driver.close();

	}

}
