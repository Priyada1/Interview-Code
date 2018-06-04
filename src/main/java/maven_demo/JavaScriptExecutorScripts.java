package maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JavaScriptExecutorScripts 

{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
	    driver.get("https://www.freecrm.com/");
	    
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")); //login button
	    
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		loginBtn.submit();
	   
	    Thread.sleep(5000);
	    //clickElementByJS(loginBtn, driver);
	}
	  public static void clickElementByJS(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].click();", element);
	    	
	    }
	   


	    
	}

		

