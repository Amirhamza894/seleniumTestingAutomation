package Table;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dynamicTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/* table is in the bottom section */
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='rd-navbar-inner']/div/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("haq8948@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Orange894");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		WebElement nav = driver.findElement(By.xpath("//div[@class='menu-item-wrapper'][1]"));
		
		a.moveToElement(nav).build().perform();
		
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		
		WebElement main = driver.findElement(By.xpath("//div[@id='dashboard-toolbar']"));
		a.moveToElement(main).build().perform();
		
		
		/* Table */
		
//		dynamic table xpath
//		td value is just changed
		//div[@class='table-wrapper']/table/tbody/tr[1]/td[2]
		//div[@class='table-wrapper']/table/tbody/tr[2]/td[2]
		//div[@class='table-wrapper']/table/tbody/tr[3]/td[2]
		
		
		String beforeXpath = "//div[@class='table-wrapper']/table/tbody/tr[";
		String afterXpath = "]/td[2]";
		Thread.sleep(5000);
		for(int i = 1; i <= 3; i++)
		{
			String name = driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.println(name);
			if(name.contains("amir"))
			{
				
				WebElement check = driver.findElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr[3]/td[1]/div/input"));
				checkbox(check, driver);
				
				
			}
		}

	}
	
	public static void checkbox(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}

}
