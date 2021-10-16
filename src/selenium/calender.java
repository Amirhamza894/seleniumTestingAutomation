package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
/* the calendar code is in the 
 * end of this program
 * */	
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000L);
		System.out.println("pass");
		
		driver.findElement(By.xpath("//a[@value = 'GOP']")).click();
		System.out.println("pass");
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("(//a[@value= 'BOM'])[2]")).click(); 
		//Selecting second path by [indexes]
		Thread.sleep(1000L);
		System.out.println("pass");
		
		// by parent-child relationship identifying
		
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='STV']")).click();
		System.out.println("passed");
		
		
		// for Selecting Current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

	}

}
