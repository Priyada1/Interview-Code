package maven_demo;


import java.util.HashMap;
import java.util.Map;



public class HashmapData {
	
	
	
	
		
		public static Map<String,String> logindata()
		{
			Map<String,String>  hmap=new java.util.HashMap<String,String>();
			
			hmap.put("customer", "naveenk_test@123");
			hmap.put("admin", "adminuser_test@123");
			
			return hmap;
			
			
		}
		
		public static HashMap<Integer,String> dateData()
		{
			HashMap<Integer,String> hmap1= new HashMap<Integer,String>();
			hmap1.put(1,"January");
			hmap1.put(1,"February");
			hmap1.put(1,"March");
			hmap1.put(1,"April");
			hmap1.put(1,"May");
			hmap1.put(1,"June");
			
			
			for(java.util.Map.Entry<Integer, String> m: hmap1.entrySet())
			{
				System.out.println(m.getValue());
			}
			return hmap1;
			
			
		}
		
		
		

	}


