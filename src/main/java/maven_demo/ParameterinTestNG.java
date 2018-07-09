package maven_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterinTestNG {

	WebDriver driver;
	
	@Test
	@Parameters({"url", "username"})
	public void loginTest(String url, String username)
	{

		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(username);
		
		
	}

}
