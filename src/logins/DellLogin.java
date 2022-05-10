package logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DellLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dell.com/dci/idp/dwa/authorize?response_type=id_token&client_id=228467e4-d9b6-4b04-8a11-45e1cc9f786d&redirect_uri=https://www.dell.com/identity/global/in/228467e4-d9b6-4b04-8a11-45e1cc9f786d&scope=openid&code_challenge=E9Melhoa2OwvFrEMTJguCHaoeK1t8URWbuGJSstw-cM&code_challenge_method=S256&tag=cid%3dcd2b5dd5-6d9b-4663-92f3-cfad4aff3c94%2caid%3df352ff0d-39f4-4443-8c31-aefad9316aa3&state=aHR0cHM6Ly93d3cuZGVsbC5jb20vSWRlbnRpdHkvZ2xvYmFsL2luL2NkMmI1ZGQ1LTZkOWItNDY2My05MmYzLWNmYWQ0YWZmM2M5ND9jPWluJmw9ZW4mcj1hcCZzPWRocyZjcz1pbmRoczEmcmVkaXJlY3RVcmw9aHR0cHM6JTJGJTJGd3d3LmRlbGwuY29tJTJGZW4taW4lMkZzaG9wJTJGZGVhbHMlMkZsYXB0b3AtZGVhbHMlM0ZnYWNkJTNEMTA0MTU5NTMtOTAxNi01NzYxMDQwLTI4NTk4MTM1Ni0wJmRnYz1TVCZnY2xpZD1FQUlhSVFvYkNoTUlub1R0b0p5bDl3SVZGcEptQWgyWDJ3TFRFQUFZQVNBQUVnTFVjUERfQndFJmdjbHNyYz1hdy5kcyZuY2xpZD1BblFWeGpuZ3E2S1lsVHpQMGFCSWtzUG1BUmdZbUNfcEZvOTRRWUJOcnVUNTJVRWlpX3Y1TUlrNmVtMFZPdHBtJnBuPUxvZ2luT3JSZWdpc3Rlcg%3d%3d");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("mdc-text-field__input")).sendKeys("abcdegh@gmail.com");
		driver.findElement(By.id("userPwd_UserInputSecret")).sendKeys("12345678");
		driver.findElement(By.id("btnSignIn")).click();
		
	}

}
