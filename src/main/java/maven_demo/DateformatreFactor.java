package maven_demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateformatreFactor {

	public static void main(String[] args) {
		
		
		String date="25/05/2018";
		
		Date d= new Date(date);
		
		SimpleDateFormat dft=new SimpleDateFormat("dd/MMMM/YYYY");
		
	    String s=dft.format(d);
	    
	    System.out.println(s);
	    
	    String[] arr=s.split("/");
	    
	   for( String a: arr)
	   {
		   System.out.println(a);
	   }
	   
	   
	   
		
		

	}

}
