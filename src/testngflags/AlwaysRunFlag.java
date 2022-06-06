package testngflags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
	
	@Test
	public void b()
	{
		Assert.fail();
		Reporter.log("b", true);
	}
	
	@Test(alwaysRun = true)
	public void c()
	{
		Assert.fail();
		Reporter.log("c", true);
	}
	
	@Test(dependsOnMethods = "b", alwaysRun = true)
	public void a()
	{
		Reporter.log("a", true);
	}

}
