package maven_demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeTest {

	
	
	 public static String[] columns= {"Name","Email","Dob","Salary"};
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		File f= new File("G:/TestData/Testdata1.xlsx");
		
	  Workbook wb=WorkbookFactory.create(f);
	  
	  Sheet sh=wb.getSheetAt(0);
	  
	  DataFormatter dft= new DataFormatter();
	  
	  for(Row r:sh)
	  {
		  for(Cell c:r)
		  {
			  String value=dft.formatCellValue(c);
			  
			  System.out.print(value+" ");
			  
		  }
		  
		  System.out.println();
	  }
	  
	  
	  Iterator<Row> itr=sh.rowIterator();
	  
	  while(itr.hasNext())
	  {
		  Row row=itr.next();
		  
		  
		  Iterator<Cell> cellitr=row.cellIterator();
		  
		  while(cellitr.hasNext())
		  {
			  Cell value=cellitr.next();
			  System.out.print(value+" ");
		  }
		  
		  System.out.println();
	  }
		
	  
	  
	 
	  
	  Workbook wb1=new XSSFWorkbook();
	  
	 // CreationHelper chelper=wb1.getCreationHelper();
	  
	  Sheet sheet1=wb1.createSheet("EMPLOYEE_Data");
	  
	  Row hrow=sheet1.createRow(0);
	  
	  for(int i=0;i<columns.length;i++)
	  {
		 Cell cell= hrow.createCell(i);
		 cell.setCellValue(columns[i]);
		 //cell.setCellStyle(arg0);;
		 sheet1.autoSizeColumn(i);
	  }
	  
	  int rowNum=1;
	  String s="Suman";
	  int v=10;
	  
	  for(int i=0;i<4;i++)
	  {
		  Row r2=sheet1.createRow(rowNum++);
		  r2.createCell(0).setCellValue(s);
		  r2.createCell(2).setCellValue(v);
		  v+=5;
	  }
	  
	  
	  FileOutputStream fout=new FileOutputStream("G:/TestData/poi-generated-fileout.xlsx");
	  wb1.write(fout);
	  fout.close();
	  wb1.close();
	  
	  
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		

	}

}
