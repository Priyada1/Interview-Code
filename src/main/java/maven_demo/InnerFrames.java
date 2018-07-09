package maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InnerFrames {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame("IF2");
		
		
		
		
		

	}

}
