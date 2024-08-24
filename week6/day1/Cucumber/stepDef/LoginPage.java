package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	public ChromeDriver driver;
	
	@Given("Launch the Browser and Load the Url")
	public void launch_the_browser_and_load_the_url() {
	    
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@When("Enter the userName as {string}")
	public void enter_the_user_name_as_demo_sales_manager(String user) {
		driver.findElement(By.id("username")).sendKeys(user);

	}
	@And("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);

	}
	@When("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("Verify Login is successful")
	public void verify_login_is_successful() {
	  
		String title = driver.getTitle();
		if(title.contains("TestLeaf")) {
			System.out.println("Login is successful");
		}else {
			System.out.println("Login is not successful");
		}
		
	}
	
	
	
	@But("Verify Login is  not successful")
	public void loginNotSuccessful() {

		String title = driver.getTitle();
		if(title.contains("TestLeaf")) {
			System.out.println("Login is  not successful");
		}else {
			System.out.println("Login is successful");
		}
	}
		
}
