package Proprtylibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadPropFile {
	
	static ChromeDriver driver;
	static EdgeDriver driver1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/* 		to create properties file right click on package name, hover on new and select other
		new window will popout look for general option, inside geeral select file and give config.properties name
		we will not write java code in that file, we will just write values in the form of key and pair. */
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\selenium\\src\\Proprtylibrary\\config.properties");
		
		prop.load(ip);
		
		String url = prop.getProperty("url");
		String browserName = prop.getProperty("browser");
		String driverchrom = prop.getProperty("webdriverchrome");
		String chromedriver = prop.getProperty("chromedriver");
		String driveredge = prop.getProperty("webdriveredge");
		String edgedriver = prop.getProperty("edgedriver");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty(driverchrom, 
					chromedriver);
			driver = new ChromeDriver();
		}
		else if (browserName.equals("Edge"))
		{
			System.setProperty(driveredge, 
					edgedriver);
			driver1 = new EdgeDriver();
		}
		
		driver1.get(url);
		driver1.manage().window().maximize();
		
	}

}
