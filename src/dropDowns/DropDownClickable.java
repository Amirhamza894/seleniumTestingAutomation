package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownClickable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
		String text_bfr = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(text_bfr);
		
/*int i = 0;
	while(i < 5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}*/
			
	for(int i=1; i<5; i++) {
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
	}
			
		driver.findElement(By.id("btnclosepaxoption")).click();
		String text_aftr = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(text_aftr);

	}

}
