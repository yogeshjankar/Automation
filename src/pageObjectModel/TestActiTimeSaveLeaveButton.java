package pageObjectModel;

import java.io.IOException;

public class TestActiTimeSaveLeaveButton extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		String userName = flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1);
		
		LoginPage lp = new LoginPage(driver);
		lp.actitimeValidLogin(userName, password);
		
		HomePage hp = new HomePage(driver);
		hp.clickSaveLeaveTimeBtn();
		hp.clickLogoutLink();
		
		bt.tearDown();
	}

}
