package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		new ChromeDriver();

	}

}
