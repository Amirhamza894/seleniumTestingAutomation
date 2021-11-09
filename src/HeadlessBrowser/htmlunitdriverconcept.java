package HeadlessBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitdriverconcept {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream pi = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\selenium\\src\\HeadlessBrowser\\config.properties");
		
		prop.load(pi);
		

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		
		/* HeadLess Concept:
		 * Headless concept is to use code and script without opening actual browser.
		 * to use this concept we will not use brower driver.
		 * we will use htmlUnitdriver but this htmlunitdriver is not avaiible in selenium
		 * we will download this seperate.
		 *  */
		WebDriver driver = new HtmlUnitDriver();
		

		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(40000);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
