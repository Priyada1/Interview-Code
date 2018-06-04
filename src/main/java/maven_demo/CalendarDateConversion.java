package maven_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarDateConversion 
{

	//@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement src=driver.findElement(By.xpath("//input[@id='src']"));
		WebElement dest=driver.findElement(By.xpath("//input[@id='dest']"));
		
		//WebElement cal=driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span"));
		//WebElement od=driver.findElement(By.xpath("//section[@id='search']/div/div[3]/div/label"));
		//WebElement rd=driver.findElement(By.xpath("//label[@class='db text-trans-uc tal']"));
		
		WebElement search=driver.findElement(By.xpath("//button[@id='search_btn']"));
		
		src.sendKeys("chennai");
		Thread.sleep(2000);
		dest.sendKeys("Bangalore");
		Thread.sleep(2000);
		
		
		search.click();
		
		Thread.sleep(2000);
		
		List<WebElement> lt=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		
		System.out.println(lt.size());
	
		
		
		for(int i=1;i<lt.size();i++)
		{
		  String date=lt.get(i).getText();
		  
			
			System.out.println(date);
			
		  if(date.equalsIgnoreCase("30"))
		  {
			  System.out.println(date);

			  lt.get(i).click();
			  
			  break;
		  }
		  
		  
		}
		
		
search.click();
		
		
		
		
	
		
		
	}
}
