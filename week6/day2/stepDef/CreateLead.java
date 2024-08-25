package stepDef;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod {


@When("Click on Crmsfa button")
public void click_on_crmsfa_button() {
	driver.findElement(By.linkText("CRM/SFA")).click();

}

@When("Click on Leads button")
public void click_on_leads_button() {
	driver.findElement(By.linkText("Leads")).click();

}

@When("Click on CreateLead button")
public void click_on_create_lead_button() {
	driver.findElement(By.linkText("Create Lead")).click();
    
}

@When("Enter the CompanyName as {string}")
public void enter_the_company_name_as(String comName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);

}

@When("Enter the FirstName as {string}")
public void enter_the_first_name_as(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

}

@When("Enter the LastName as {string}")
public void enter_the_last_name_as(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

}

@When("Click on Sumbit Button")
public void click_on_sumbit_button() {
	driver.findElement(By.name("submitButton")).click();

}

@Then("Verify the CreateLeadPage")
public void verify_the_create_lead_page() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Qeagle")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
}
}
