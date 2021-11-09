package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class javaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class = 'rd-navbar-inner'] /div/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();

	}

}
