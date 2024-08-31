package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Login_TC_001 extends BaseClass {	
	
	@BeforeTest
	public void Value() {
		
		filepath="Login";
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void runnerz(String uName,String pWd) {
		System.out.println(driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uName)
		.enterPassword(pWd)
		.clickonLoginButtom()
		.clickOnCrmsfa();
	}
}
