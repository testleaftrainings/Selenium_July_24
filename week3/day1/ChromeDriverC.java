package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverC extends ChromiumDriverP {
	
	public void driver() {
		System.out.println("driver- child");
	}
	
	public static void main(String[] args) {
		
		ChromeDriverC cd=new ChromeDriverC();
		cd.allbrowser();
		cd.chromedriver();
		cd.edgedriver();
		cd.driver();
		//gp-1
		//p-2
		//c-1
		// ChromeDriverC extends ChromiumDriverP
		//ChromiumDriverp extends RemoteWebDriverGp
		
		ChromeDriver driver=new ChromeDriver();
	
	}

}
