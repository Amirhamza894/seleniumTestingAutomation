package e2ebiginnerproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentTestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Test Case 1 - Automate first Menu link of amazon.in and print page title
		Steps to Automate:
		1. Launch browser of your choice say., firefox, chrome etc.
		2. Open this URL -  www.amazon.in
		3. Maximize or set size of browser window.
		4. Get the page title and print it.
		5. Now, click on first menu link say 'Amazon Pay' (or choose any other link from the menu list)
		6. Get the page title and print it.
		7. Navigate back to Home Page.
		8. Get the page title and print it. Verify that value matches with output of point no. 4
		9. Close the browser.*/
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement footer = driver.findElement(By
				.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterDescLine'] /table/tbody"));
		List<WebElement> links = footer.findElements(By
				.xpath("//tr/td/a"));
		for(int i = 0; i < links.size(); i++)
		{
			String ClickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			links.get(i).sendKeys(ClickOnLinks);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println(driver.getTitle());
		}

	}

}
