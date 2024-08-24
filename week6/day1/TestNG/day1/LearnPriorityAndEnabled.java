package week6.day1;

import org.testng.annotations.Test;

public class LearnPriorityAndEnabled {

	
	@Test(priority=3)
	public void CreateLead() {
		System.out.println("CreateLead");
	}
	
	@Test(priority = 1)
	public void DeleteAccount() {
		System.out.println("DeleteAccount");

	}
	
	@Test(priority=2)
	public void EditLead() {
		System.out.println("EditLead");

	}
	
	@Test(enabled=false)
	public void DuplicateAccount() {
		System.out.println("DuplicateAccount");

	}
	
	@Test(priority=-2,enabled =false)
	public void MergeAccount() {
		System.out.println("MergeAccount");

	}
	
	
}
