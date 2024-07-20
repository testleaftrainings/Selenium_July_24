package week1.day1;

public class Browser {

	//global variable
	int age=30;
	
	public static void main(String[] args) {

		//dataType variableName= value
		//variable -local variable, Global variable
		//local variable- create inside the main method -brown color
		//global variable- create inside the class level -blue color
		
		int noOfTabsOpen=3;
		boolean checkBrowserLoaded=true;
		char checkFirstLetterOfTheBrowser='C';
		String browserName="Chrome";
		float browserVersion=123.45f; //add f or F end of the value
		long phone=984568728732l; //add l or L end of the value
		
		System.out.println("Number open tabs presented :"+noOfTabsOpen);
		System.out.println("Browser is Loaded :"+checkBrowserLoaded);
		System.out.println("Browser Name :"+browserName+"\n"+"Give Phone NO: "+phone);
	}

}
