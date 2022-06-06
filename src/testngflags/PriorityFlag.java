package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
	
	@Test(priority = 4)
	public void h()
	{
		Reporter.log("h", true);
	}
	
	@Test
	public void a()
	{
		Reporter.log("a", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("c", true);
	}
	
	@Test(priority = 3)
	public void k()
	{
		Reporter.log("k", true);
	}
	
	@Test(priority = 1)
	public void l()
	{
		Reporter.log("l", true);
	}
	
	@Test(priority = 7)
	public void f()
	{
		Reporter.log("f", true);
	}
	
	@Test
	public void z()
	{
		Reporter.log("h", true);
	}
	
	@Test(priority = 0)
	public void b()
	{
		Reporter.log("b", true);
	}

}
