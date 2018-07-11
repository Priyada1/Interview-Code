package maven_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TooltipMessage {
	static WebDriver driver;
	public static void main(String[] args) 
	{
		/*System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		 driver= new FirefoxDriver();
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(200,600)","" );
		
		WebElement sRuby=driver.findElement(By.xpath("//div[@id='text-22-sub_row_1-0-2-0-0']/div/ul/li/a[1]/img"));
		String tooltipMsg=sRuby.getAttribute("title");
		System.out.println("Tooltip message is: "+tooltipMsg);
		
	
		WebElement html1=driver.findElement(By.xpath("//*[@id='text-22-sub_row_1-0-2-1-0']/div/ul/li/a[1]/img"));
		String tooltipMsg2=html1.getAttribute("title");
		System.out.println("Tooltip message is: "+tooltipMsg2);*/
		
		jquery_tooltipMessage();
		

	}
	
	public static void jquery_tooltipMessage()
	{
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/tooltip/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//System.out.println("main frame name is: "+driver.switchTo().defaultContent());
	
		new WebDriverWait(driver,10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		
		
		WebElement tooltips3=driver.findElement(By.cssSelector("a[title$='what this widget is']"));
		 System.out.println("tooltips message is: "+tooltips3.getAttribute("title"));
		 System.out.println("Label name is: "+tooltips3.getText());
		 
		 WebElement age=driver.findElement(By.cssSelector("input#age"));
		 System.out.println("age tooltip message is: "+age.getAttribute("title"));
		 System.out.println("label name  is: "+age.getText());
		
	}

}
