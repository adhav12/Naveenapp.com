package pomtest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DashboardTest extends BaseTest {
	@Test(priority = 2)
	public void verifyDashboardpage() {
		 boolean verifyDashboard = dashboard.navToDashboard();
		 softAssert.assertTrue(verifyDashboard);
}
	@Test(priority = 3)
	public void  clickonMytimesheetsButton() {
		dashboard.clickonMytimesheets(); 
	}
}