package maven_demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
     
		
		File f =new File("G:/TestData/Testdata1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		
		
		//XSSFWorkbook and XssfSheet are used for .xlsx file ,HSSFWorkbook is used for .xls file
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
	
		
		// org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(fi);
		
		//HSSFWorkbook wb=new HSSFWorkbook(fi);
		
		//HSSFSheet sheet1=wb.getSheetAt(0);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		// org.apache.poi.ss.usermodel.Sheet sheet1 = wb.getSheetAt(0);
		
		int r=sheet1.getLastRowNum();
		
		
		
		for (int i=1;i<r;i++)
		{
			String value=sheet1.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(value);
			
		}
		System.out.println("****method1 end*****");
		
		for (int c=1;c<3;c++)
		{
			for (int i=1;i<r;i++)
			{
				String val=sheet1.getRow(i).getCell(c).getStringCellValue();
				System.out.print(val+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("****method2 end*****");
		
//by using Iterator print values:- it prints only String
		
	/*	Iterator <Row> itr1= sheet1.rowIterator();
		Iterator <Row> itr2= sheet1.rowIterator();
		
		itr1.next();
		itr2.next();
		
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		
		while(itr1.hasNext() || itr2.hasNext())
		{
			a1.add(itr1.next().getCell(0).getStringCellValue());
			
			a2.add(itr2.next().getCell(2).getStringCellValue());
			
			
		}
		
		System.out.println("ArrayList:::::"+a1);
		System.out.println("ArrayList:::::"+a2);
		
		
		System.out.println("****method3 end*****");*/
		
		
		System.out.println("****method4 Start*****");
		
	 
		
	
		
		
		
		
		
		
		
	}

}
