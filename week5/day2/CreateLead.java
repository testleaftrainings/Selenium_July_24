package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	//indices -index start from 
	@DataProvider(name="fetchData" ,indices = {0,2})
	public String[][] setValue() throws IOException{
		/*
		 * String[][] data=new String[3][4]; data[0][0]="TestLeaf"; data[0][1]="Vinoth";
		 * data[0][2]="S"; data[0][3]="4567890";
		 * 
		 * data[1][0]="TestLeaf"; data[1][1]="Vineeth"; data[1][2]="R";
		 * data[1][3]="234567";
		 * 
		 * data[2][0]="TestLeaf"; data[2][1]="Bhuvanesh"; data[2][2]="M";
		 * data[2][3]="56780";
		 */
		
		//** step 5
		//call excel program -static keyword inside call
		//ClassName.methodName();
		String[][] readValue = IntegrationWIthTC.readValue();
		return readValue;
	}

	@Test(dataProvider = "fetchData")
	public  void runCreateLead(String cName,String fName,String lName,String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}
