package week3.day2;

public abstract class SBI implements RBI {

	
	//abstract class with 0 to 100 abstract methods
	//it will  have both implement and unimplement methods
	public void rdRoi() {
System.out.println("6.75%");		
	}
	
	public void minBalance() {
		System.out.println("1000");
	}
	
	//we need have atleast one abstract methods
	public abstract void pl();
	
	public static void main(String[] args) {
		//we can create object Interface ? No
		//RBI r=new RBI();
		
		//We can create object for abstract class? no
		//xSBI s=new SBI();
	}
}
