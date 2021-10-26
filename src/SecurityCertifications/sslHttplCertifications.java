package SecurityCertifications;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sslHttplCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\hp\\Downloads\\edgedriver_win64123\\msedgedriver.exe");
		
//		DesiredCapabilities = General browser profile (Customise browser setting)
		DesiredCapabilities ch = DesiredCapabilities.edge();
//		ch.acceptInsecureCerts();
//		 OR
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		EdgeOptions c = new EdgeOptions();
		c.merge(ch);
		EdgeDriver driver = new EdgeDriver(c);
		
		driver.get("abc");

	}

}
