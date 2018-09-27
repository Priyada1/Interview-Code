package maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Unhandle_Certificate {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		//DesiredCapabilities is used to set environment/type of browsers/browserVersion/SSl Certificate issue/unexpected Alert behaviour/
		//it enables/disables behaviour related to Browsers
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.cacert.org/");
		
		
		
		
	}

}
