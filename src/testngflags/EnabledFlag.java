package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	
	
  @Test(enabled = true)
  public void login()
  {
	  Reporter.log("Login performed", true);
  }
  
  
  
  //  This method will not executed as we have passes enabled = false
  @Test(enabled = false)
  public void logOut() 
  {
	  Reporter.log("Logout performed", true);
  } 
}
