package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ExcelIntegration;


public class BaseClass {
	
	public  ChromeDriver driver;
	public String filepath;
	@BeforeMethod
	public void preCondition() {
	 driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="fetchData" ,indices = {0,1})
	public String[][] setValue() throws IOException{
		
		String[][] readValue = ExcelIntegration.readValue(filepath);
		return readValue;
	}
}
