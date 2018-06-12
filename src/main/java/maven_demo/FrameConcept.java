package maven_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FrameConcept {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("Http://The-Internet.Herokuapp.Com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(50, 400)", "");
		
		driver.findElement(By.xpath("//div[@id='content']/ul/li[19]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[2]/a")).click();
       
		System.out.println(driver.findElements(By.tagName("iFrame")).size());
		
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[1]/a")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		List<WebElement> li=driver.findElements(By.tagName("frame"));
		
		for(WebElement s: li)
		{
			System.out.println(s.getText());
		}
		
	}

}
