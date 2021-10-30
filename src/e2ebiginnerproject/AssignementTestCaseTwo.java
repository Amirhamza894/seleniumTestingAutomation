package e2ebiginnerproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignementTestCaseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Test Case 2 - Automate all the Menu links of techlistic.com
		Steps to Automate:
		1. Launch browser of your choice say., firefox, chrome etc.
		2. Open this URL -  https://www.techlistic.com/
		3. Maximize or set size of browser window.
		4. Click on 'Java Tutorial' link and validate page title.
		5. Navigate back to Home Page.
		6. Click on 'Selenium Tutorial' link and validate page title.
		7. Navigate back to Home Page.
		8. Click on 'Selenium Blogs' link and validate page title.
		9. Navigate back to Home Page.
		10. Click on 'TestNG Blogs' link and validate page title.
		11. Close the browser. */
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class = 'overflowable-contents'] /div/ul/li/a"));
		for(int i = 0; i < links.size(); i++)
		{
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			if(links.get(i).getText().contains("JAVA"))
			{
				links.get(i).sendKeys(click);
				
			}
			else if(links.get(i).getText().contains("SELENIUM"))
			{
				links.get(i).sendKeys(click);
			}
			else if(links.get(i).getText().contains("TESTNG"))
			{
				links.get(i).sendKeys(click);
				break;
			}
			
		}
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String title = driver.getCurrentUrl();
			System.out.println(title);
		}
		
	}

}
