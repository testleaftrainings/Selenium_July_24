package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	
	@Parameters({"url","pwd","uname","browser"})
	
	@BeforeMethod
	public void preCondition(String url,String password,String username,String browser) {
	 
//		if(browser.equalsIgnoreCase("Chrome")) {
//		driver  = new ChromeDriver();
//		}else if(browser.equalsIgnoreCase("Edge")) {
//			driver=new EdgeDriver();
//		}
		
		//Chrome
		//Edge
		switch (browser) {
		case "Chrome":
			driver=new ChromeDriver();
			break;

			case "Edge":
				driver=new EdgeDriver();
				break;
		default:
			System.out.println("Browser is not loaded");
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
}
