package logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GmailSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();


		driver.findElement(By.tagName("input")).sendKeys("8954534582");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("56897");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
