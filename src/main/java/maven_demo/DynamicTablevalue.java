package maven_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTablevalue {

	public static void main(String[] args) 
	{
     boolean flag=false;
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
			
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//*[@id='1532281341172-0-uiGrid-0005-cell']/div
		//*[@id='1532281341172-2-uiGrid-0005-cell']/div
		//*[@id='1532281341172-0-uiGrid-0005-cell']/div
		//div[starts-with(@id,'1532281341172')]
		//*[@id='1532281341172-1-uiGrid-0000-cell']/div
		//*[@id='1532281341172-3-uiGrid-0000-cell']/div
		for(int j=0;j<100;j++)
		{
		List<WebElement> li1=driver.findElements(By.xpath("//div[contains(@id,'uiGrid-0005-cell')]/div"));
		
		for(int i=0;i<li1.size();i++)
		{
			String s=li1.get(i).getText();
			//System.out.println("EmailValue:>>> "+s);
			if(s.equals("patadia@gmail.com"))
			{
				
				
		        flag=true;
				
				
				break;
				
				
			}
	
		}
		
		if(flag==true)
		{
			System.out.println("email found");
			break;
			
		}
		else
		{
		
	
		WebElement next=driver.findElement(By.className("ui-grid-pager-next"));
		next.click();
		}
		
		}

	}

}
