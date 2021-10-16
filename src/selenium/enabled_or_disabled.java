package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class enabled_or_disabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("[id = 'ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		driver.findElement(By.cssSelector("input[name = 'ctl00$mainContent$view_date1']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		// to check that the date block is disabled or not?
//		System.out.println(driver.findElement(By.cssSelector("input[name = 'ctl00$mainContent$view_date2']")).isDisplayed());
		
/* you noticed that Disabled or enabled method
 * not working fine, click on that block to check
 * that it disabled or enabled by clicking*/
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Date is enabled!");
			Assert.assertTrue(true);
			Thread.sleep(2000L);
			driver.findElement(By.cssSelector("input[name = 'ctl00$mainContent$view_date2']")).click();
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		}
		else {
			System.out.println("It's Disabled");
			Assert.assertTrue(false);
		}

	}

}
