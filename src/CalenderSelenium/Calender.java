package CalenderSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElementByXPath("//input[@id = 'travel_date']").click();
		
		
		// Selecting Year "2023'
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class = 'datepicker-switch']")).getText().contains("2022"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class = 'next']")).click();
		}
		
		// Selecting Month "December"
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class = 'datepicker-switch']")).getText().contains("December"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class = 'next']")).click();
		}
		
		
		
		// Selecting Date
		
		List<WebElement> dates = driver.findElementsByXPath("//td[@class='day']");
		
		int countDates = driver.findElementsByXPath("//td[@class='day']").size();
		
		for(int i=0; i <= countDates; i++)
		{
			String Day =driver.findElementsByXPath("//td[@class='day']").get(i).getText();
			
			if(Day.equalsIgnoreCase("27"))
			{
				driver.findElementsByXPath("//td[@class='day']").get(i).click();
				break;
			}
		
		}
		
	}

}
