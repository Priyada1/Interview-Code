package maven_demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadConcept {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Priyadarshi/Desktop/Selenium/AutoITuploadfile.html");
		
		driver.findElement(By.xpath("//input[@id='1']")).click();//sendKeys("C:/Users/Priyadarshi/Desktop/Selenium/Xpath.txt");
		
		
		//AutoIT Script running code
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("G:/AutoIT_FileUpload/AutoITFileupload_Scripts/FileUploadAutoIt.exe");

	}

}
