package maven_demo;



// first reverse the input String then compliment those as A=z or b=y or c=x....so on and vice versa
public class MindtreeQuestions {
  static String s1="abxdz";
	public static void main(String[] args) 
	{
		
		char[] s2=s1.toCharArray();
		String s3="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s2[i]);
			s3=s3+s2[i];	
		}
		System.out.println(s3);
		
		char[] s4=s3.toCharArray();
		
		String s5="";
		
		for(int j=0;j<s3.length();j++)
		{
			if(s4[j]=='a')
			{
				s5=s5+"z";
			}
			else if(s4[j]=='b')
			{
				s5=s5+"x";
			}
			else if(s4[j]=='z')
			{
				s5=s5+"a";
			}
			else if(s4[j]=='x')
			{
				s5=s5+"b";
			}
			else
			{
				s5=s5+s4[j];
			}
		}
		
		System.out.println(s5);
		
		
		
		

	}

}
