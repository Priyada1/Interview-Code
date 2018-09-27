package maven_demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OracleDBconnection {

	

	
	public static void main(String[] args) throws IOException  {
	
		
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "Nishkam.*1");
		
		
		Statement st=conn.createStatement();
		
		ResultSet rs=st.executeQuery("Select * from IPL");
		
		
		while(rs.next())
		{
			
			
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
			a1.add(rs.getString(1));
			a2.add(rs.getInt(2));
			
			
		}
		
		
		conn.close();
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		//Exporting Data to Excel
		
	//	G:/TestData/
		
		
		String[] columns= {"Team", "Position"};
		
		Workbook wb=new XSSFWorkbook();//Exporting/writing data to excel
		
		Sheet sh=wb.createSheet("IPLResult");
		
		Row hrow=sh.createRow(0);
		
		for(int i=0; i<columns.length;i++)
		{
			Cell cell=hrow.createCell(i);
			cell.setCellValue(columns[i]);
			sh.autoSizeColumn(i);
		}
		
		int rowNum=1;
		
		Iterator<String> itr1=a1.iterator();
		Iterator<Integer> itr2=a2.iterator();
		
		while(itr1.hasNext() || itr2.hasNext())
		{
		
		Row row=sh.createRow(rowNum++);
		
		row.createCell(0).setCellValue(itr1.next());
		row.createCell(1).setCellValue(itr2.next());
		}
		
		
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("G:/TestData/iplresult.xlsx");
			
			wb.write(fout);
			fout.close();
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		

	}

}
