package dropDowns;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownEcommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000L);
		
		int j = 0;
		String[] myList = {"Cauliflower", "Tomato", "Brinjal"};
		
		List<WebElement> siteList = driver.findElements(By.xpath("//h4[@class = 'product-name']"));
		
		for(int i = 0; i <= siteList.size(); i++)
		{
			String[] singleItem = siteList.get(i).getText().split("-");
			String itemFormated = singleItem[0].trim();
			
			List myListFormated = Arrays.asList(myList);
			
			if(myListFormated.contains(itemFormated))
			{
				driver.findElements(By.xpath("//div[@class = 'product-action'] /button")).get(i).click();
				j++;
				
				if(j == myList.length)
				{
					break;
				}
			}
		}

	}

}
