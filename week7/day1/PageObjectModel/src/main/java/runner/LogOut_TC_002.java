package runner;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LogOut_TC_002 extends BaseClass {

	
	@Test
	public void runnerz() {
		System.out.println(driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickonLoginButtom().clickOnLogout();
	}
}
