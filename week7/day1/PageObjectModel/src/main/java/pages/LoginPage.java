package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUserName(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);

		//method 1
		//LoginPage lp=new LoginPage();
		//return lp;
		
		//method 2
		return this;
	}
	public LoginPage enterPassword(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);
		
		return this;

	}
	public HomePage clickonLoginButtom() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//if you want connect with next page
		//next page constructor
		//return new HomePage()
		/*
		 * HomePage hp=new HomePage(); return hp;
		 */
		
		return new HomePage(driver);
		
		
	}

}
