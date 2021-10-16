package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).isSelected());
		
		driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).isSelected());
		
		
		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
		

	}

}
