package maven_demo;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass_FileUpload {

	public static void main(String[] args) throws Exception
	{
	   
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		  WebElement browse=driver.findElement(By.id("imagesrc"));
		  
		  browse.click();
		  
		  Robot rbt=new Robot();
		  
		  rbt.setAutoDelay(2000);
		  
		  
		  // these below two line code for Control+C
		  StringSelection stringSel=new StringSelection("C:/Users/Priyadarshi/Desktop/FileUpload.jpg");
		  Toolkit.getDefaultToolkit().getSystemClipboard().getContents(stringSel);
		  
		  rbt.setAutoDelay(2000);
		  
		  //
		  rbt.keyPress(KeyEvent.VK_CONTROL);
		  rbt.keyPress(KeyEvent.VK_V);
		  
		  rbt.keyRelease(KeyEvent.VK_CONTROL);
		  rbt.keyRelease(KeyEvent.VK_V);
		  
		  
		  rbt.setAutoDelay(3000);
		  
		  rbt.keyPress(KeyEvent.VK_ENTER);
		  rbt.keyRelease(KeyEvent.VK_ENTER);
		  
		  
		  
		  

	}

}
