package maven_demo;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;


public class LatestReadWriteSheet {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		
		File f=new File("G:/TestData/Testdata1.xlsx");
		
		  // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(f);

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        
        
        Iterator<Sheet> sheetItr1= workbook.sheetIterator();
        System.out.println("Retrieving Sheets using Iterator");
      
        while(sheetItr1.hasNext())
        {
        	Sheet sheet=sheetItr1.next();
        	System.out.println("=>>"+sheet.getSheetName());
        }
     // 2. Or you can use a for-each loop
        System.out.println("Retrieving Sheets using For Each loop");
        
        for(Sheet sheet:workbook)
        {
        	System.out.println("=>>"+sheet.getSheetName());
        }
        
        
        //3. // 3. Or you can use a Java 8 forEach with lambda
      /*  System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
        
        workbook.forEach(sheet ->{
        	System.out.println("=> " + sheet.getSheetName());
        });*/
        
        
        /*
        ==================================================================
        Iterating over all the rows and columns in a Sheet (Multiple ways)
        ==================================================================
     */
        
        
        Sheet sheet=workbook.getSheetAt(0);
        // Create a DataFormatter to format and get each cell's value as String
        
        DataFormatter dft=new DataFormatter();
        // 1. You can obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        
        Iterator<Row> rowItr=sheet.rowIterator();
        while(rowItr.hasNext())
        {
        	Row row=rowItr.next();
        	
        	// Now let's iterate over the columns of the current row
        	
        	Iterator<Cell> cellItr=row.cellIterator();
        	
        	while(cellItr.hasNext())
        	{
        		Cell cell=cellItr.next();
        		String cellValue=dft.formatCellValue(cell);
        		
        		System.out.print(cellValue+"\t");
        		
        	}
        	System.out.println();

        }
        
        
        // 2. Or you can use a for-each loop to iterate over the rows and columns
        System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
        
        for(Row row:sheet)
        {
        	for(Cell cell:row)
        	{
        		String cellValue=dft.formatCellValue(cell);
        		
        		System.out.print(cellValue+"\t");
        	}
        	
        	System.out.println();
        }
        
        // 3. Or you can use Java 8 forEach loop with lambda
     /*   System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
        sheet.forEach(row -> {
            row.forEach(cell -> {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            });
            System.out.println();
        });*/
        
        
        //closing Workbook
        
        workbook.close();
        
        
        
	}

}
