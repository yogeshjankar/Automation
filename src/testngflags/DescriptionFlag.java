package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
	
	
	@Test(description = "This method performs login")
	public void login()
	{
	
		Reporter.log("Login is performed",true);
	}
	
	@Test(description = "This method performs logout")
	public void logOut() 
	{
		Reporter.log("Logout is performed", true);
	}

}
