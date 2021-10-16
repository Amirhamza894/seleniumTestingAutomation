package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class facebook_xpath_css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.getTitle();
		driver.getCurrentUrl();
		
//		By Xpath
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("text");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		
//		By CSS
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hello"); // Method 1
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("123456");      // method 2
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
