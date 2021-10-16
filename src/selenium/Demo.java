package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://google.com");              // to launched site
		String title = driver.getTitle();             // to get site/page title
		
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Correct Title");
		}
		
		else {
			System.out.println("Incorrect Title");
		}
		
		
		System.out.println(driver.getCurrentUrl());     // get Current site/page url
		
//		System.out.print(driver.getPageSource());      // get current page source code
		
		driver.get("http://facebook.com");
		System.out.println("Site launched");
		
		driver.navigate().back();                     // for back navigation
		System.out.println("Back to Site");
		
		driver.close();
//		driver.quit();
		
	}

}
