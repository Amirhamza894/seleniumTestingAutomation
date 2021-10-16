package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class end_to_end_travelsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		// set Browser dimension
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		
		//hit the site
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//find Elements
		
		for(int n = 0; n < 2; n++)
		{
			if(n == 0)
			{
				//Country
				driver.findElement(By.xpath("//input[@id = 'autosuggest']")).sendKeys("pa");
				Thread.sleep(2000L);
				//get all suggested options
				List<WebElement> sugestions = driver.findElements(By.xpath("//li[@class = 'ui-menu-item'] //a"));
				
				for(WebElement suggest : sugestions) 
				{
					if(suggest.getText().equalsIgnoreCase("pakistan"))
					{
					suggest.click();
					break;
					}
				}
				if(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected())
				{
					driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
					Thread.sleep(2000L);
					driver.findElement(By.xpath("//a[@value = 'GAU']")).click();
					Thread.sleep(1000L);
//					driver.findElement(By.xpath("(//a[@value = 'CCU'])[2]")).click();
					driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'CCU']")).click();
					Thread.sleep(2000L);
					driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
					
					if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
					{
						Assert.assertTrue(true);
						driver.findElement(By.id("divpaxinfo")).click();
						Thread.sleep(2000L);
						
						for(int i=0; i<3; i++) 
						{
						driver.findElement(By.id("hrefIncAdt")).click();
						}
						
						driver.findElement(By.id("btnclosepaxoption")).click();
						Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
						Thread.sleep(1000L);
						s.selectByVisibleText("INR");
						
						driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).click();
						
						driver.findElement(By.xpath("//input[contains(@name, 'FindFlights')]")).click();
						
					}
				}
			}
			else if(n == 1)
			{
				//Country
				driver.findElement(By.xpath("//input[@id = 'autosuggest']")).sendKeys("pa");
				Thread.sleep(2000L);
				//get all suggested options
				List<WebElement> sugestions = driver.findElements(By.xpath("//li[@class = 'ui-menu-item'] //a"));
				
				for(WebElement suggest : sugestions) 
				{
					if(suggest.getText().equalsIgnoreCase("pakistan"))
					{
					suggest.click();
					break;
					}
				}
				
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				Thread.sleep(2000L);
				driver.findElement(By.xpath("//a[@value = 'GAU']")).click();
				Thread.sleep(1000L);
//				driver.findElement(By.xpath("(//a[@value = 'CCU'])[2]")).click();
				driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'CCU']")).click();
				Thread.sleep(2000L);
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
				
				if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
				{
					Assert.assertTrue(true);
					driver.findElement(By.id("divpaxinfo")).click();
					Thread.sleep(2000L);
					
					for(int i=0; i<3; i++) 
					{
					driver.findElement(By.id("hrefIncAdt")).click();
					}
					
					driver.findElement(By.id("btnclosepaxoption")).click();
					Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
					Thread.sleep(1000L);
					s.selectByVisibleText("INR");
					
					driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).click();
					
					driver.findElement(By.xpath("//input[contains(@name, 'FindFlights')]")).click();
				}
				else
				{
					driver.findElement(By.id("Div1")).click();
					driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
					driver.findElement(By.id("divpaxinfo")).click();
					Thread.sleep(2000L);
					
					for(int i=0; i<3; i++) 
					{
					driver.findElement(By.id("hrefIncAdt")).click();
					}
					
					driver.findElement(By.id("btnclosepaxoption")).click();
					Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
					Thread.sleep(1000L);
					s.selectByVisibleText("INR");
					
					driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).click();
					
					driver.findElement(By.xpath("//input[contains(@name, 'FindFlights')]")).click();
				}
			}
		}
	}

}
