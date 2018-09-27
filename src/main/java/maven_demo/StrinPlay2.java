package maven_demo;

public class StrinPlay2 {

	public static void main(String[] args) 
	{
		 
		StrinPlay2 sp= new StrinPlay2();
		
		System.out.println(sp);
		
		String s1= "Java";
		String s2="book";
		int i=95;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("Java");
		String s4= new String("Java");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1.equals(s4));

		System.out.println(s1+"Home");
		
		System.out.println(s2.concat(s1));
		
		String res=s2+i;
		
		System.out.println(res);
		
		System.out.println(s1+" // "+s2+"  // "+s4);
		
		
		
		
		
		
		
		
		
		

	}
	
	//toString() method is present in Object class, to get value we have to override this method(object class is superclass of all classes)
	public String toString()
	{
		return "This is ME";
	}

}
