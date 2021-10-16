package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://secure.indeed.com/account/login?hl=en_US&service=my&co=US&continue=https%3A%2F%2Fwww.indeed.com%2F");
		driver.getTitle();
		driver.getCurrentUrl();
//		driver.findElement(By.id("login-email-input")).sendKeys("sample text");     //Note: Cmake sure your eclapse compiler version should match with jdk version
		                                                                //myElement .sendKeys(new String { "text" });
//		driver.findElement(By.name("__password")).sendKeys("12345678");
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
//		driver.findElement(By.xpath("//*[@id=\"login-submit-button\"]")).click();   // when name, id, linktext faild and classname have spaces then we use Xpath
		
		
		driver.findElement(By.xpath("//input[@id='login-email-input']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='login-password-input']")).sendKeys("12345678");
		String y = driver.findElement(By.cssSelector("#login-register-link")).getText();
		System.out.println(y);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		String x = driver.findElement(By.cssSelector("#label-login-password-input-error")).getText();    // getText() use to get text
		System.out.println(x);
		

		
		
		driver.quit();
		
		/* Xpath and CSS Validation
		 $x("") put ur Xpath in the double qoutes in browser's console
		 $("") put your css in the double qoutes in the browser's console */
	}

}
