package maven_demo;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshotcode {
    static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		 driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		takeScreenshotsmethod("google_login");
	}
		
		public static void takeScreenshotsmethod(String screen) throws IOException
		{
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("G:/eclipse-workspace/maven_demo/src/main/java/screenshotFiles/"+screen+".png"));
			
			
			
		}
		
		
	

	}


