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
		
		flash(loginbtn, driver); //highlight
		drawBorder(loginbtn, driver);  //Drawborder
//		generateAlert(driver, "there is a bug in this button");  //alert message
		clickElementByJS(loginbtn, driver);  //click on element by javascript
		refreshBrowserByJS(driver);    // refresh the page by javascript
		System.out.println(getTitlebyJS(driver));
		System.out.println(getPageText(driver));
		driver.navigate().back();
//		scrollPagebyJS(driver);
		
		WebElement link = driver.findElement(By.xpath("//h6[text()='Contact Us']"));
		
		scrollIntoView(link, driver);
		
		
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
	
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	public static void refreshBrowserByJS(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}

	public static String getTitlebyJS(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageText(WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPagebyJS(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}










