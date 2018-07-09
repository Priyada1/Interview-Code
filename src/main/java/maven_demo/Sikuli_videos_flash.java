package maven_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_videos_flash {

	public static void main(String[] args) throws Exception {
		
		
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes&t=369s");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		Screen sc=new Screen();
		
		Pattern image1=new Pattern("G:/Sikuli_Image/FlashObject_videos/PlayButton.PNG");
		Pattern image2=new Pattern("G:/Sikuli_Image/FlashObject_videos/Settings.PNG");
		Pattern image3=new Pattern("G:/Sikuli_Image/FlashObject_videos/Sound.PNG");
		Pattern image4=new Pattern("G:/Sikuli_Image/FlashObject_videos/PauseButton.PNG");
		
		
		sc.wait(image4, 10).click(image4);
		Thread.sleep(4000);
		
		//sc.wait(image1, 10).click(image1);
		//Thread.sleep(4000);
		
		sc.wait(image2, 10).click(image2);
		Thread.sleep(4000);
		
		
		sc.wait(image3, 10).click(image3);
		
		
		
		
		
		

	}

}
