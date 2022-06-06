package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest  {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		String validUserName = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "pass");
		
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		lp.actitimeValidLogin(validUserName, validPassword);
	}

}
