package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Interview_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//------1 Q: what is the difference between absolute and relative xpath?
		driver.findElement(By.xpath("//input[@class = 'search-keyword']")).click();
       /*Mean when we direct traverse that specific element through xpath is Relative xpath*/
		
		driver.findElement(By.xpath("//div[@class = 'search']/form/input")).click();
       /*Mean when we traverse an element through parent-child technique, like we select parent 
        * of that element and moving to that specific child element.*/

//------2 Q: How to identify siblings in that block?
		driver.findElement(By.xpath("//div[@class = 'cart']/a[2]")).click();
		// how to traverse this element's next sibling?
		
		driver.findElement(By.xpath("//div[@class = 'cart']/a[2]/following-sibling::a[1]")).click();
		/*with the help of /following-sibling:: */
		
//-----3 Q: how to identify parent from child element?
		driver.findElement(By.xpath("//div[@class = 'cart']/a[2]/parent::div")).getAttribute("Role");
		/*with the help of /parent:: */
		
//-----4 Q: identify objects with text using xpath locator
		driver.findElement(By.xpath("//*[text() = 'GreenKart']")).getText();

	}

}
