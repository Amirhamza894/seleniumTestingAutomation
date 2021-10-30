package e2ebiginnerproject;

import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Test Case 2 - Open Godaddy.com and Print it's Page title.
		Steps to Automate:
		1. Launch browser of your choice say., Firefox, chrome etc.
		2. Open this URL - https://www.godaddy.com/
		3. Maximize or set size of browser window.
		4. Get Title of page and print it.
		4. Get URL of current page and print it.
		5. Close browser.*/
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
