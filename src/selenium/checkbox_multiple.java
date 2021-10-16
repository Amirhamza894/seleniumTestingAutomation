package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkbox_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		System.out.println("Total checkboxes on page");
		System.out.println(driver.findElements(By.xpath("//input[@type = 'checkbox']")).size());
		
		List<WebElement> all_checkbox = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		
		int total_size = all_checkbox.size();
		
		for(int i=0; i < total_size; i++)
		{
			all_checkbox.get(i).click();
			boolean on = all_checkbox.get(i).isSelected();
			
			if(on == true)
			{
				System.out.println("Checkbox is On");
			}
			else
			{
				System.out.println("Checkbox is off");
			}
		}

	}

}
