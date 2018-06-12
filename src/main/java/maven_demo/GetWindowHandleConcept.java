package maven_demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandleConcept {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		
		System.out.println(parent);
		
		//driver.findElement(By.xpath("//div[@class='bmsTop']/ul/li[1]/a")).click();
		
		Set<String> win=driver.getWindowHandles(); // it returns all open browsers 
		
		for(String child: win)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				System.out.println("Child window name is :"+child);
			}
		}

	}

}
