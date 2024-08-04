package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass extends SBI{

	public void kyc() {

System.out.println("pan card");		
	}


	public void pl() {
System.out.println("13.4%");		
	}
	
	public static void main(String[] args) {
		ExecutionClass ec=new ExecutionClass();
		ec.kyc();
		ec.rdRoi();
		ec.pl();
		ec.minBalance();
ChromeDriver driver=new ChromeDriver();
driver.findElement(By.id(null)).sendKeys(args);
	}

}
