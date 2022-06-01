package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest  {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		String validUserName = flib.readPropertyFile("./data/config.properties", "username");
		String validPassword = flib.readPropertyFile("./data/config.properties", "pass");
		
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		lp.actitimeValidLogin(validUserName, validPassword);
	}

}
