package maven_demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinksDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("Http://The-Internet.Herokuapp.Com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		List<WebElement> li1=driver.findElements(By.tagName("a"));
		List<WebElement> li2=driver.findElements(By.tagName("img"));
		li1.addAll(li2);
		
		System.out.println("total number of links:--> "+li1.size());
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		for(int i=0;i<li1.size();i++)
		{
			if(li1.get(i).getAttribute("href")!=null)
			{
				activeLinks.add(li1.get(i));
			}
		}
		
		System.out.println("Active links size is: "+activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++)
		{
			try
			{
				HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
				connection.connect();
				String response=connection.getResponseMessage();
				connection.disconnect();
				System.out.println(activeLinks.get(j).getAttribute("href")+"----->"+response);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		

	}

}
