package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		// counts links on the page
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.xpath("//a")).size());
		
		// how can we count the links in the footer section?
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		// Footer Sub Section links
		WebElement footerSubSectionDriver = footerDriver.findElement(By.xpath("//table[@class = 'gf-t']/tbody/tr/td[1]"));
		
		System.out.println(footerSubSectionDriver.findElements(By.tagName("li")).size());
		
		// How click on all links in that Section number by number
		
		for(int i = 1; i < footerSubSectionDriver.findElements(By.tagName("li")).size(); i++) 
		{
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerSubSectionDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> it = wins.iterator();
		
		while(it.hasNext())
		{

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}

	}

}
