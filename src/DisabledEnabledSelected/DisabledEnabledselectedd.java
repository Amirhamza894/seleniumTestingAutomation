package DisabledEnabledSelected;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DisabledEnabledselectedd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		
		boolean signupbtn = driver.findElement(By.xpath("//main[@class='page-content']/section/a")).isDisplayed();
		System.out.println(signupbtn);
		boolean signupbtnenbl = driver.findElement(By.xpath("//main[@class='page-content']/section/a")).isEnabled();
		System.out.println(signupbtnenbl);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//label[@for='bmw']/input")).click();
		boolean slctdbtn = driver.findElement(By.xpath("//label[@for='bmw']/input")).isSelected();
		System.out.println(slctdbtn);

	}

}
