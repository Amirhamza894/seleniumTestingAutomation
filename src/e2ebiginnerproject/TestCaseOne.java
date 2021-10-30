package e2ebiginnerproject;

import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Test Case 1 - Open Godaddy.com and maximize browser window.
		Steps to Automate:
		1. Launch browser of your choice say., Firefox, chrome etc.
		2. Open this URL - https://www.godaddy.com/
		3. Maximize or set size of browser window.
		4. Close browser.
		*/
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		driver.close();

	}

}
