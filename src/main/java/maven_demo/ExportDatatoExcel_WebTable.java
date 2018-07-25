package maven_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExportDatatoExcel_WebTable {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
			
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		String[] heading= {"Email","Phone"};
		
		Workbook wb= new XSSFWorkbook();
		Sheet sh= wb.createSheet("Emails from WEBTable");
		Row r=sh.createRow(0);
		
		for(int j=0;j<heading.length;j++)
		{
			Cell c=r.createCell(j);
			c.setCellValue(heading[j]);
			sh.autoSizeColumn(j);
		}
		
		List<String> list1=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();
		
		for(int i=0;i<100;i++)
		{
			List<WebElement> li1=driver.findElements(By.xpath("//div[contains(@id,'uiGrid-0005-cell')]/div"));
			List<WebElement> li2=driver.findElements(By.xpath("//div[contains(@id,'uiGrid-0009-cell')]/div"));
			
			for(WebElement e1:li1)
			{
				System.out.println(e1.getText());
				list1.add(e1.getText());
			}
			for(WebElement e2:li2)
			{
				System.out.println(e2.getText());
				list2.add(e2.getText());
			}
			
			WebElement next=driver.findElement(By.className("ui-grid-pager-next"));
			next.click();
			
		}
		
		Iterator<String> itr1=list1.iterator();
		Iterator<String> itr2=list2.iterator();
		int rowNum=1;
		
		while(itr1.hasNext() || itr2.hasNext())
		{
			Row row=sh.createRow(rowNum++);
			row.createCell(0).setCellValue(itr1.next());
			row.createCell(1).setCellValue(itr2.next());
			sh.autoSizeColumn(0);
			sh.autoSizeColumn(1);
			
		}
		
		
		
		FileOutputStream fout=new FileOutputStream("G:/TestData/WebData.xlsx");
		
		wb.write(fout);
		
		fout.close();
		wb.close();

	}

}
