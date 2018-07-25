package maven_demo;



import java.io.FileInputStream;
import java.io.IOException;

import jxl.Workbook;

import jxl.Sheet;
import jxl.read.biff.BiffException;


public class ImportDatafromExcel {

	public static void main(String[] args) throws BiffException, IOException 
	{
		/*System.setProperty("webdriver.firefox.marionette", "G:/geckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
			
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		
		WebElement userName=driver.findElement(By.name("username"));

		WebElement pass=driver.findElement(By.name("password"));
		*/
		
		//File f=new File("G:/TestData/Data11.xlsb");
		
		 // Creating a Workbook from an Excel file (.xls or .xlsx)
		FileInputStream fs = new FileInputStream("G:/TestData/Data12.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh=wb.getSheet(0);
        
        //using For Loop
        
        int rowNum=sh.getRows();
        int colNum=sh.getColumns();
        
        for(int i=1;i<rowNum;i++)
        {
        	for(int j=0;j<colNum;j++)
        	{
        		System.out.print(sh.getCell(j, i).getContents()+"\t");
        	}
        	System.out.println();
        }
        
        
        /*  // read data using While loop
        DataFormatter dft=new DataFormatter();
        
        Iterator<Row> itrRow=sh.rowIterator();
        
        while(itrRow.hasNext())
        {
        	Row r=itrRow.next();
        	Iterator<Cell> itrCell=r.cellIterator();
        	
        	while(itrCell.hasNext())
        	{
        		Cell c=itrCell.next();
        		String value=dft.formatCellValue(c);
        		System.out.println(value);
        		userName.sendKeys(value);
        	}
        }
        */
        
        
  /*      
        for(int i=0;i<2;i++)
        {
        	for(int j=1;j<4;j++)
        	{
        		
        		Row r=sh.createRow(j);
        		r.createCell(i).setCellValue(arg0);
        		String user=dft.formatCellValue(c);
        		String pass1=dft.formatCellValue(c);
        		
        		userName.sendKeys(user);
        		pass.sendKeys(pass1);
        	}
        }
		
		*/

	}

}
