package maven_demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenNewTabFromcurrentTab 
{
	public static WebDriver driver;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/tooltip/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String parentTab=driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");//open new tab
		driver.get("https://google.com/");
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");//switch to another tab
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"/t");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"w");//close the window
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");//switch to another tab
		
		
	}
	
}
