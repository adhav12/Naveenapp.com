package pomtest;

import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {
		@Test(priority = 2)
		public void verifyDashboardpage() {
		 boolean verifyDashboard = dashboard.navToDashboard();	
	     softAssert.assertTrue(verifyDashboard);
	     softAssert.assertAll();
}
	@Test(priority = 3)
	public void  clickontimesheetsButton() {
		dashboard.clickontimesheets(); 
	}
}