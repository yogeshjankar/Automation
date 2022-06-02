package pageObjectModel;

import java.io.IOException;

public class TestActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			
			lp.actitimeInvalidLogin(invalidUsername, invalidPassword);
			
		}
		bt.tearDown();
		
	}

}
