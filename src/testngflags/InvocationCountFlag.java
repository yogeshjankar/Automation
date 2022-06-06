package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
	
	
	// This method will get executed 500 times as we have given invocationCount = 500
	@Test(invocationCount = 500)
	public void login()
	{
		Reporter.log("login performed", true);
	}

}
