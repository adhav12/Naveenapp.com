package pomtest;

import org.testng.annotations.Test;

import extendLisners.ExtendLisdners;

public class LoginTest extends ExtendLisdners {
	@Test(priority = 1)
	public void login() {
		login.loginToApp();

	}

}
