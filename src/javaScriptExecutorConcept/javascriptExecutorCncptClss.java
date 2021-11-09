package javaScriptExecutorConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class javascriptExecutorCncptClss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/* 	blanking or highlighting elements with the help of javascript executor
		  	Javascript DOM can extract hidden elements
			because selenium cannot identify hidden elements - (Ajax implementation)
			investigate the properties of object if it have any hidden text 
		 */

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class = 'rd-navbar-inner'] /div/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Login']"));
		
		flash(loginbtn, driver);
		
	}
	
	public static void flash(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 0; i < 15; i++)
		{
			changeColor("rgb(0, 200, 0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
		}
	}

}
