package testngflags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsFlag {

	@Test
	public void b()
	{
		//Assert.fail();
		Reporter.log("b", true);
	}
	
	@Test(dependsOnMethods = "b")
	public void a()
	{
		Reporter.log("a", true);
	}
}
