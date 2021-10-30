package e2ebiginnerproject;

import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Test Case 3 - Open Godaddy.com and Validate Page Title
		  Steps to Automate: 
		  1. Launch browser of your choice say., Firefox, chrome etc.
		2. Open this URL - https://www.godaddy.com/
		3. Maximize or set size of browser window.
		4. Get Title of page and validate it with expected value.
		5. Get URL of current page and validate it with expected value.
		6. Get Page source of web page.
		7. And Validate that page title is present in page source.
		8. Close browser.*/
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String src = driver.getPageSource();
		Thread.sleep(3000);
		if(src.contains("Why should I transfer my domain, website or web hosting to GoDaddy?"))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
