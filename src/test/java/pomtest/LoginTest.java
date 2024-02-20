package pomtest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import extendLisners.ExtendLisdners;
import pompages.LoginPage;
public class LoginTest extends BaseTest {
	@Test(priority = 1)
	public void  login() throws InterruptedException {
		login .loginToApp();
		 } 
	
}

