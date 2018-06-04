package maven_demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		

		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		 driver= new FirefoxDriver();
		 
		 
		 Dimension d=new Dimension(200,400);
		 driver.manage().window().setSize(d);;
		 
		 driver.manage().deleteAllCookies();
		 
		 //implicit Wait 
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 
		 driver.get("https://www.google.com/");
		 
		 driver.navigate().to("https://www.makemytrip.com/");
		 
		 driver.navigate().back();
		 
		 driver.navigate().forward();
		 
		 //ExplicitWait
		 explicitWaitfn(driver.findElement(By.id("ch_login_icon")), 40);
		 
		 			
			Thread.sleep(5000);
			
			driver.navigate().back();
			
		 
		 
		 
		 //FluentWait concept
		 
		 fluentWaitFn();
		 

	}
	
	public static void explicitWaitfn(WebElement logIn, int timeOut ) 
	{
		new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(logIn));
		
		System.out.println("###################");
		logIn.click();

		
	}
	
	public static void 	 fluentWaitFn()
	{
		Wait<WebDriver> wt=new FluentWait<WebDriver>(driver)
				.withTimeout(45, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		 WebElement search = wt.until(new Function<WebDriver, WebElement>() 
		 {
		     public WebElement apply(WebDriver driver) 
		     {
		       return driver.findElement(By.id("searchBtn"));
		    }
				
		 });
		 
		 search.click();
		
	}

}
