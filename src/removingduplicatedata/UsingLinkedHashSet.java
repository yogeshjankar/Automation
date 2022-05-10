package removingduplicatedata;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingLinkedHashSet {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/html/MultiSelectDropdown.html");
		Thread.sleep(5000);

		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);

		// get list of web elements
		List<WebElement> options = sel.getOptions();


		// declare LinkedHashSet to eleminate duplicates
		LinkedHashSet<String> s = new LinkedHashSet<String>();


		//read the list and get the text
		for(int i=0;i<options.size();i++) 
		{
			WebElement opt = options.get(i);
			String text = opt.getText();
			
			//add the text to set so that duplicate won't be accepted
			s.add(text);
		}
		
		
		//read the text
		for(String se:s)
		{
			System.out.println(se);
		}
		



	}

}
