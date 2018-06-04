package maven_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.Connection;

public class DatabaseConnections {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Register the Driver
		
	//	Class.forName("com.mysql.jdbc.Driver");
		
		//Establish Connections
		
		//Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Selenium");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila?useUnicode=true&characterEncoding=utf8&user=root&password=Selenium");
		//Create a Statement for Writing Queries
		
		Statement st=conn.createStatement();
		
		ResultSet r=st.executeQuery("Select * from sakila.actor");
		
		List<Integer> expected=new ArrayList<Integer>();
		
		while(r.next())
		{
			expected.add(r.getInt(1));
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
