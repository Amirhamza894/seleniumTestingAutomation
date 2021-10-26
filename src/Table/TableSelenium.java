package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TableSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38032/sl-vs-ned-12th-match-group-a-icc-mens-t20-world-cup-2021");
		WebElement Table = driver.findElementByCssSelector("div[class = 'cb-col cb-col-100 cb-ltst-wgt-hdr']");
		int sum = 0;
		int rows = Table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms']")).size();
		int rowsE = Table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i = 0; i < rowsE - 2; i++)
		{
			String values = Table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int val = Integer.parseInt(values);
			sum = sum + val;
		}
		String Extras = Table.findElement(By.xpath("//div[text() = 'Extras']/following-sibling::div[1]")).getText();
		String Total = Table.findElement(By.xpath("//div[text() = 'Total']/following-sibling::div[1]")).getText();
		sum = sum + Integer.parseInt(Extras);
		int total = Integer.parseInt(Total);
		
		if(sum == total)
		{
			System.out.println("Calculation Matches");
		}
		else {
			System.out.println("Calculation Didn't Matches");
		}
		
	}

}
