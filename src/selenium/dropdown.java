package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id = 'ctl00_mainContent_DropDownListCurrency']")));
		s.selectByIndex(2);
		s.selectByValue("USD");
		s.selectByVisibleText("INR");
		

	}

}
