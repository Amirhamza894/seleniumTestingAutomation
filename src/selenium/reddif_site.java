package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class reddif_site {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.getTitle();
		driver.getCurrentUrl();
		
//		Regular Expression for xpath nd css
//		xpath---> "//tagname[contains(@attribute, 'value')]"
//		css-----> "tagname[attribute* = 'value']"

		driver.findElement(By.xpath("//a[contains(@title, 'Sign in')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login')]")).sendKeys("hello");
		driver.findElement(By.xpath("//input[contains(@id, 'passwor')]")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@type, 'submi')]")).click();
		String X = driver.findElement(By.cssSelector("div[class*='div_login_'] b")).getText();
		// the above css selector nd below xpath use when there is no attributes in html tags/code
		String y = driver.findElement(By.xpath("//div[contains(@class, 'div_login_')]")).getText();
		
		System.out.println(X);
		System.out.println(y);
	}

}
