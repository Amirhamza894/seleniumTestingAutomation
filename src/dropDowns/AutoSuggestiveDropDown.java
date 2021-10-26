package dropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, 50);
		driver.get("https://www.makemytrip.com/");
		
		// Source City
		w.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//input[@id = 'fromCity']")));
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();

		w.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//input[@placeholder = 'From']")));
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("new");
		
		w.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//div[@id = 'react-autowhatever-1']")));
		
		List<WebElement> counts = driver.findElements(By.xpath("//li[@role = 'option']"));
		
		for(WebElement count : counts)
		{
			
			if(count.getText().contains("New York"))
			{
				count.click();
				break;
			}
		}
		
		
		// Destination City
		w.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//input[@id='toCity']")));
//		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		
		w.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//input[@placeholder = 'To']")));
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("kara");
		
		w.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//div[@id = 'react-autowhatever-1']")));
		
		List<WebElement> countDest = driver.findElements(By.xpath("//li[@role = 'option']"));

		for(WebElement Dest : countDest)
		{
			if(Dest.getText().contains("Karachi"));
			{
				Dest.click();
				break;
			}
		}
	}

}
