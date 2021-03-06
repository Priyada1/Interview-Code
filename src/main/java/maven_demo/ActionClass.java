package maven_demo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("Http://The-Internet.Herokuapp.Com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@id='content']/ul/li"));
		
		for(WebElement s: li)
		{
			System.out.println(s.getText());
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(50, 400)", "");
		
		
		driver.findElement(By.xpath("//div[@id='content']/ul/li[19]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='content']/div/ul/li[1]/a")).click();
		
		
		System.out.println("###########################");
		
		
		Set<String> win=driver.getWindowHandles();
		
		for(String s:win)
		{
			System.out.println(s);
		}
		driver.switchTo().frame(0);
		
        
		
		
		
		
		
		
		
	}

}
