package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Decleraton

	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath = "//a[.='Create new tasks']") private WebElement createNewTasks;
	@FindBy(xpath = "//div[.='Settings']") private WebElement setings;

	
	

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
	
	//generic method
	public void sendUsername() {
		
	}
	
	//operational method


}
