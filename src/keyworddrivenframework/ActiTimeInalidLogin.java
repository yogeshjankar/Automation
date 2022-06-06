package keyworddrivenframework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeInalidLogin extends BaseTest{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_Path, "invalidcreds");
		
		bt.openBrowser();
		for(int i=1;i<=rc;i++)
		{
		String username = flib.readExcelData(EXCEL_Path, "invalidcreds", i, 0);
		String password = flib.readExcelData(EXCEL_Path, "invalidcreds", i, 1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		}
		
		bt.closeBrowser();
	}

}
