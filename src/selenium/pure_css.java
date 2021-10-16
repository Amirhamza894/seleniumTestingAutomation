package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class pure_css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		/* ---xpath---
		 * //tagname[@attribute = 'value']
		 *//*[attribute = 'value']
		 *
		 * ---CSS---
		 * tagname[@attribute = 'value']
		 * [attribute = 'value']
		 * */
		
		driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("hello");
		
		// now with xpath
		driver.findElement(By.xpath("//div[@id = 'passContainer']/input")).sendKeys("hello");
		driver.findElement(By.xpath("//div[@class = '_6lux']/input")).sendKeys("hello");

	}

}
