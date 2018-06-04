package maven_demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoibiboCalendarDate {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		
		WebElement ow=driver.findElement(By.id("gi_oneway_label"));
		WebElement rt=driver.findElement(By.id("gi_roundtrip_label"));
		WebElement multiCity=driver.findElement(By.id("gi_multicity_label"));
		
		WebElement from=driver.findElement(By.id("gosuggest_inputSrc"));
		
		WebElement to=driver.findElement(By.id("gosuggest_inputDest"));
		
		
		
		
		System.out.println("Default oneay is selected:"+ow.isSelected());
		
		
		rt.click();
		
		System.out.println(driver.getTitle());
		
		from.sendKeys("Chennai");
		
		Thread.sleep(8000);
		
	//	driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
	
		to.sendKeys("mumbai");
		
		Thread.sleep(4000);
		
		WebElement depart=driver.findElement(By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/input"));
		WebElement return1=driver.findElement(By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[2]/div/input[1]"));
		
		depart.click();
		String fromDate="20180530";
		String returnDate="20180616";
		
		
		driver.findElement(By.xpath("//*[@id='fare_"+fromDate+"']")).click();
		
		Thread.sleep(4000);
		
		return1.click();
		
		driver.findElement(By.xpath("//*[@id='fare_"+returnDate+"']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='gi_search_btn']")).click();

		
		Thread.sleep(4000);
		
		WebElement airline=driver.findElement(By.id("airlinesFilter"));
		
		Actions act= new Actions(driver);
		act.moveToElement(airline).build().perform();
		
		driver.findElement(By.xpath("//*[@id='filtersContainer']/ul/li[4]/ul/li[5]/span[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id='filtersContainer']/ul/li[6]/span/label")).click();
		
		WebElement more=driver.findElement((By.xpath("//*[@id='header']/div[1]/ul/li[9]/div")));
		WebElement offer=driver.findElement((By.xpath(".//*[@id='header']/div[1]/ul/li[9]/div/div/a[6]/span")));
		
		Actions act1= new Actions(driver);
		act1.moveToElement(more).build().perform();
		offer.click();
		
		



		
		
		
		
		
		
		
		
		
		
		

	}

}
