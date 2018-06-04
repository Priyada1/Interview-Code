package maven_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 *Practice Exercise 2
Launch new Browser
Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
Get the value from cell ‘Dubai’ with using dynamic xpath
Print all the column values of row ‘Clock Tower Hotel’
 */
public class Practice_DynamicWebElement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		
		
		
		String s1=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		
		System.out.println(s1);
		
		String s2=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[2]/th")).getText();
		System.out.println(s2);
		
		for (int i=1;i<5;i++)
		{
			String s3=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();
			if(s3.equalsIgnoreCase("Clock Tower Hotel"))
			{
				for(int j=1;j<6;j++)
				{
					System.out.println(driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				}
			}
		}
		
		
		List<WebElement> element=driver.findElements(By.tagName("a"));
		
		int size=element.size();
		System.out.println("Number of Links:"+size);
		
		
		/*for(int i=0;i<size;i++)
		{
			element.get(i).click();
			driver.navigate().back();
		}
		*/
		
		
		
		
		
		
		
		
		

	}

}
