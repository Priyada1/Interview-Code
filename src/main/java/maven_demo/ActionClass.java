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
		driver.get(" https://www.flipkart.com/");
		
		String s= driver.getWindowHandle();
		System.out.println(s);
		
		/*Set<String> li= driver.getWindowHandles();
		
		for(String winHandle :li ){
			
			System.out.println(winHandle);
			//driver.switchTo().window(winHandle);
			}*/
			System.out.println("Title of the page after - switchingTo: " + driver.getTitle());
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		WebElement un=driver.findElement(By.className("_2zrpKA"));
		WebElement pass=driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		
		//WebElement lgnbtn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		un.sendKeys("7094894680");
		pass.sendKeys("Nishkam.*1");
		
		driver.findElement(By.xpath("//form/div[3]/button")).submit();
		
		WebElement elect=driver.findElement(By.xpath("//*[@id='container']/div/header/div[3]/div/ul/li[1]/a/span"));
		WebElement mob=driver.findElement(By.xpath("//a[contains(@title,'Mobile Accessories')]/span[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(elect).build().perform();
		mob.click();
		
		WebElement min=driver.findElement(By.xpath("//div[@class='_1QaKk1']/select"));
		Select sel=new Select(min);
		sel.selectByValue("400");		
		
		
		//This will scroll the page till bottom
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(100,1200)", "");
		
		//WebElement checkbox=driver.findElement(By.xpath("//div[@title='Mi Redmi 5A']/div/div/label/input"));
		
		
		
		//This will scroll the page till the element is found		
        //js.executeScript("arguments[0].scrollIntoView();", checkbox);
        WebElement item1=driver.findElement(By.xpath("//div[contains(text(),'SanDisk Ultra Dual Drive M3.0 32 GB OTG Drive')]"));
        item1.click();
        
        
		
		
		
		
		
		
		
	}

}
