package maven_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_DemoAuto {
 public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> li1=driver.findElements(By.xpath("//div[contains(@id,'uiGrid-0005-cell')]/div"));
		
		for(int i=0;i<li1.size();i++)
		{
			String s=li1.get(i).getText();
			System.out.println(s);
		}
		
		

	}

}
