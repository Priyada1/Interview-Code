package maven_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {
	
	
	private static String[] columns= {"name","email","dob","salary"};
	private static List<Employee> emp= new ArrayList<>();
	
	
	// Initializing employees data to insert into the excel file
	
	static 
	{
		  Calendar dob = Calendar.getInstance();
		  dob.set(1992, 06, 23);
		  
		  emp.add(new Employee("Rajeev","rajeev32@gmail.com",dob.getTime(),4567.78));
		  
		  dob.set(1990, 07, 23);
		  emp.add(new Employee("Samesh", "sms234@gmail.com",dob.getTime(),887.90));
		  
		  
		  
		  
		  
		  
		
	}

	public static void main(String[] args) throws IOException {
	
		
		 // Create a Workbook
		
		Workbook wb=new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file
		
		 /* CreationHelper helps us create instances of various things like DataFormat, 
        Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
		
		CreationHelper createHelper = wb.getCreationHelper();
		
		 // Create a Sheet
		
		Sheet sheet= wb.createSheet("Employee");
		   // Create a Font for styling header cells
		Font headerFont=wb.createFont();
		headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());
        
        
     // Create a CellStyle with the font
        CellStyle headerCellStyle=wb.createCellStyle();
        headerCellStyle.setFont(headerFont);
        
     // Create a Row
        Row headerRow = sheet.createRow(0);
        
     // Create cells
        
        for(int i=0;i<columns.length;i++)
        {
        	Cell cell=headerRow.createCell(i);
        	
        	cell.setCellValue(columns[i]);
        	
        	cell.setCellStyle(headerCellStyle);
        	
        }
        
        
     // Create Cell Style for formatting Date
        
        CellStyle dateCellStyle=wb.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
        
        
        // Create Other rows and cells with employees data
        
        int rowNum=1;
        
        for(Employee e:emp)
        {
        	Row row=sheet.createRow(rowNum++);
        	row.createCell(0).setCellValue(e.getName());
        	
        	row.createCell(1).setCellValue(e.getEmail());
        	
        	row.createCell(2).setCellValue(e.getDob());
        	
        	row.createCell(3).setCellValue(e.getSalary());
        }
        
        
        
        
        
        
        
    	// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("G:/TestData/poi-generated-file.xlsx");
        wb.write(fileOut);
        fileOut.close();

        // Closing the workbook
        wb.close();
        
        
        
        System.out.println("*****Data Imported to Excel**********");
		
		
		
	
		
		

	}

}
