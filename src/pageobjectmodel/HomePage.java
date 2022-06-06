package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Decleraton

	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath = "//a[.='Create new tasks']") private WebElement createNewTasks;
	@FindBy(xpath = "//div[.='Settings']") private WebElement setings;
	@FindBy(id = "SubmitTTButton") private WebElement saveLeaveTimeBtn;

	
	

	// Initialization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}




	// Utilization
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getCreateNewTasks() {
		return createNewTasks;
	}

	public WebElement getSetings() {
		return setings;
	}


	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}
	

	
	//operational method
	
	public void clickLogoutLink()
	{
		logoutLink.click();
		
	}
	
	public void clickSaveLeaveTimeBtn()
	{
		saveLeaveTimeBtn.click();
	}
	
	

	

}
