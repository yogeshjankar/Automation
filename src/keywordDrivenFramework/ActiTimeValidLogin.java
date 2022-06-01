package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;


// BaseTest extended to access the driver ref. variable
public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {


		//Object creation
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();


		//reading data from property file
		String userName = flib.readPropertyFile(PROP_PATH, "username");
		String password = flib.readPropertyFile(PROP_PATH, "pass");

		// browser opening
		bt.openBrowser();
		Thread.sleep(3000);


		//  Performing login operation
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

}
