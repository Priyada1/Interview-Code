package maven_demo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebElementTable
{
	//public static WebDriver driver;
public static void  main(String[] args)
{

	System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
		
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com/");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("naveenk");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("test@123");
	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	
	
	driver.switchTo().frame("mainpanel");
	
	
	//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
	
	System.out.println(driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[2]/tbody/tr[14]/td[1]/a")).getText());
	
	//*[@id='vContactsForm']/table/tbody/tr[8]/td[2]
	//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]
	
	/*String s1=driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]")).getText();
	
	System.out.println(s1);
	
	
	
	
 String s2="//*[@id='vContactsForm']/table/tbody/tr[";
 String s3="]/td[2]";
 
 for(int i=4;i<=9;i++)
 {
	 String name=driver.findElement(By.xpath(s2+i+s3)).getText();
	 
	 if(name.contains("abc abc"))
	 {
		 driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
			
	 }
 }
	
	
//Method-2	
 driver.findElement(By.xpath("//a[contains(text(),'Akash Rathor')]/parent::td//preceding-sibling::td//input[contains(@name,'contact_id')]")).click();
 

	
	*/
	
	
	
}
}
