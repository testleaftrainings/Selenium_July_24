package hooks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.leafground.com/table.xhtml");

String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
System.out.println("first value in the table :"+text);


//3rows, 5col -2nd-row 3rd-col
String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td[3]")).getText();
System.out.println("Print the value of 2nd Row and 3rd Col "+text2 );




List<WebElement> row = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
int rowCount = row.size();
System.out.println("total number of rows  :"+rowCount);


List<WebElement> col = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
int colCount = col.size();
System.out.println("total number pf cols :"+colCount);

for (int i = 1; i <=rowCount; i++) {
	
	for (int j = 1; j <=colCount; j++) {
		
		String text3 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(text3);
		
		
	}
}




	}

}
