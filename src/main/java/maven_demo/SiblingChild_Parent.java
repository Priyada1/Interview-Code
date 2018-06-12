package maven_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SiblingChild_Parent {

	public static void main(String[] args) 
	{
	  
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		
		String s=driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr[1]/td[4]/following-sibling::td[2]/a")).getText();
		System.out.println(s);

	}

}
