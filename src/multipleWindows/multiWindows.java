package multipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class multiWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.xpath("//a[normalize-space()='Help']")).click();
//				driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> idIterat = ids.iterator();
		String ParentId = idIterat.next();
		String childId = idIterat.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class = 'appbar-scroll-box'] /div/div/div/div/a[2]")).click();
	}

}
