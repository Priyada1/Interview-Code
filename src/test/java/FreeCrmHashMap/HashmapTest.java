package FreeCrmHashMap;

//import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import maven_demo.HashmapData;

public class HashmapTest {
	WebDriver driver;
	String credentials;
	String info[];
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		
		driver = new FirefoxDriver();

		
		driver.get("https://www.freecrm.com/");
	}
	
	@Test (priority=1)
	public void loginWithCustomerUser() throws InterruptedException
	{
		credentials=HashmapData.logindata().get("customer");
		info=credentials.split("_");
		
		for(String s: info)
		{
			System.out.println(s);
		}
		driver.findElement(By.name("username")).sendKeys(info[0]);
		driver.findElement(By.name("password")).sendKeys(info[1]);
		 WebElement loginbtn= driver.findElement(By.xpath("//input[@type='submit']"));
		 
		 JavascriptExecutor jse=(JavascriptExecutor) driver;
		 jse.executeScript("arguments[0].click();", loginbtn);
		 
		 Thread.sleep(5000);
		 
		 driver.switchTo().frame("processFrame");
		 driver.findElement(By.xpath("//a[contains(@title,'Calendar')]")).click();
		 String date=HashmapData.dateData().get(4);
		 
		 
		 
		
		
		
		
	}
	
	@Test( priority=2)
	public void loginWithAdminUser()
	{
		credentials=HashmapData.logindata().get("admin");
		info=credentials.split("_");
		
		for(String s: info)
		{
			System.out.println(s);
		}
		driver.findElement(By.name("username")).sendKeys(info[0]);
		driver.findElement(By.name("password")).sendKeys(info[1]);
		 WebElement loginbtn= driver.findElement(By.xpath("//input[@type='submit']"));
		 
		 JavascriptExecutor jse=(JavascriptExecutor) driver;
		 jse.executeScript("arguments[0].click();", loginbtn);
		 
		
		}
	
	@AfterMethod
	public void endUP()
	{
		driver.quit();
	}


}
