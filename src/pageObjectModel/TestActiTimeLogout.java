package pageObjectModel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		String userName = flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1);
		
		lp.actitimeValidLogin(userName, password);
		
		HomePage hp = new HomePage(driver);
		hp.clickLogoutLink();
		
		
	}
}
