package e2ebiginnerproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentTestCaseThree {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*Test Case 3 - Automate all the Menu links of amazon.in and Verify page titles
		Steps to Automate:
		1. Launch browser of your choice say., firefox, chrome etc.
		2. Open this URL -  www.amazon.in
		3. Maximize or set size of browser window.
		4. Get the page title and print it.
		5. Click on first menu link, say 'Amazon Pay'.
		6. Get Page title and verify it with expected value.
		7. Navigate back to Home Page. 
		8. Get Page title and verify it with expected value.
		9. Repeat steps 5 to 8 for other menu links.
		10. Close the browser.*/
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 20);

		List<WebElement> link = driver.findElements(By.xpath("//div[@id='nav-xshop'] /a"));
		List<String> match = Arrays.asList("Amazon Pay", "Electronics", "Computers");
		for(int i = 0; i < link.size(); i++)
		{
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			for(String mat : match)
			{
				if(link.get(i).getText().equalsIgnoreCase(mat))
				{
					link.get(i).sendKeys(click);
				}
			}
			
		}
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		ArrayList<String> tab = new ArrayList<String>();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			if(driver.getTitle().equalsIgnoreCase("Amazon Pay"))
			{
				System.out.println("Amazon Pay: PASS");
			}
			else if(driver.getTitle().equalsIgnoreCase("Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in"))
			{
				System.out.println("Electronics: PASS");
			}
			else if(driver.getTitle().contains("Computers"))
			{
				System.out.println("Computers: Fail");
			}
			else {
				System.out.println("Fail");
			}
		}
	}	
	
}
