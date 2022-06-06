package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	// Decleration

	@FindBy(name = "username") private WebElement usn;
	@FindBy(name = "pwd") private WebElement pass;
	@FindBy(id = "loginButton") private WebElement loginBtn;
	@FindBy(id = "keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(xpath = "//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id = "licenseLink") private WebElement licenseLink;



	// Initialization

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	// Utilization

	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}

	// ActiTime valid login

	public void actitimeValidLogin(String validUserName, String validPassword)
	{
		usn.sendKeys(validUserName);
		pass.sendKeys(validPassword);
		loginBtn.click();	
	}


	public void actitimeInvalidLogin(String invalidUserName, String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUserName);
		pass.sendKeys(invalidPassword);
		loginBtn.click();
		usn.clear();
	}

}
