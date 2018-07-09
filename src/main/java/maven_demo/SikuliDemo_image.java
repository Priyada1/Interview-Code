package maven_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;




public class SikuliDemo_image {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		Screen sc=new Screen();
        
       Pattern image1=new Pattern("G:/Sikuli_Image/GmailLogo.PNG");
       Pattern image5=new Pattern("G:/Sikuli_Image/InkedGmailSignINPage.JPG");
      /* Pattern image4=new Pattern("G:/Sikuli_Image/SignInLogo.PNG");
       Pattern image2=new Pattern("G:/Sikuli_Image/EmailTextBox.PNG");
       Pattern image3=new Pattern("G:/Sikuli_Image/NextButton.PNG");
       
     
       
       
       sc.wait(image1, 10);
       sc.click(image1);
  Thread.sleep(4000);
       
       sc.wait(image4, 5000);
       sc.click(image4);
       
       Thread.sleep(10000);
       
       sc.type(image2,"ashtmarghi@gmail.com");
       sc.click(image2);
       
       sc.wait(image3, 10);
       sc.click(image3);
       
       
       */
       //Image Comparison using Sikuli
       
       sc.wait(image1, 10);
       sc.click(image1);
  Thread.sleep(15000);
       
       String img=sc.capture().save("G:/Sikuli_Image/", "image");

       Finder f1=new Finder(sc.capture().getImage());
       f1.find(image5);
       if(f1.hasNext()){

           Match m=f1.next();
           System.out.println("Match found with "+(m.getScore() * 100) +"%");
           f1.destroy();

       }
       else{

           System.out.println("No Match Found");
       }
       
       
	}

}
