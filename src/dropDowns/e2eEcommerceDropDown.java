package dropDowns;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class e2eEcommerceDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

//Implicit wait in selenium
		/*
		 * implicit wait use just once and it waits until page or element or process not
		 * complete
		 */
		
		
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//explicit wait in Selenium
		/*
		 * explicit wait use when certain element or targeted element loads or become
		 * visible
		 */
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")));
		String[] myList = { "Cauliflower", "Tomato", "Potato" };
		additems(driver, myList);
		addCart(driver, w);
		applyCupoun(driver, w);

	}

	public static void additems(EdgeDriver driver, String[] myList) {

		int j = 0;

		List<WebElement> siteList = driver.findElements(By.xpath("//h4[@class = 'product-name']"));

		for (int i = 0; i <= siteList.size(); i++) {
			String[] singleItem = siteList.get(i).getText().split("-");
			String itemFormated = singleItem[0].trim();

			List myListFormated = Arrays.asList(myList);

			if (myListFormated.contains(itemFormated)) {
				driver.findElements(By.xpath("//div[@class = 'product-action'] /button")).get(i).click();
				j++;

				if (j == myList.length) {
					break;
				}
			}

		}

	}

	public static void addCart(EdgeDriver driver, WebDriverWait w) {
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='PROCEED TO CHECKOUT']")));
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	}

	public static void applyCupoun(EdgeDriver driver, WebDriverWait w) {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		String text = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();

		if (text.equalsIgnoreCase("Code applied ..!")) {
			System.out.println("Copoun Applied");
		} else {
			System.out.println("Cupoun is in-correct");
		}

	}

}
