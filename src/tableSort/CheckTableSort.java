package tableSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class CheckTableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//thead /tr/th[1]")).click();
		List<WebElement> weblist = driver.findElements(By.xpath("//tbody /tr/td[1]"));
		ArrayList<String> orignalList = new ArrayList<String>();
		
		for(int i = 0; i < weblist.size(); i++)
		{
			orignalList.add(weblist.get(i).getText());
		}
		
		ArrayList<String> copiedList = new ArrayList<String>();
		
		for(int i = 0; i < orignalList.size(); i++)
		{
			copiedList.add(orignalList.get(i));
		}
		
		Collections.sort(copiedList);
		
		System.out.println("************CopiedList*************");
		for(String s : copiedList)
		{
			System.out.println(s);
			
		}
		
		System.out.println("************OrignalList*************");
		for(String s : orignalList)
		{
			System.out.println(s);
			
		}
		
		if(orignalList.equals(copiedList))
		{
			System.out.println("The button has successfully sorted the values, Congrats");
		}
		else {
			System.out.println("Values Not Sorted");
		}
		Assert.assertTrue(orignalList.equals(copiedList));
		

	}

}
