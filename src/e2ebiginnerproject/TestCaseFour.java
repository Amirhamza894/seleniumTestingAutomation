package e2ebiginnerproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseFour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*launch amazon site and navigate to footer 
		 * sections and click on every link there
		 * */
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
