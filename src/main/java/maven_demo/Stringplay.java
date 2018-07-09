package maven_demo;



/****************I have written below program to count occurrence of words in the the string.
 * String sample="i am in india india in";
 * @author Priyadarshi
 *
 */
public class Stringplay{

public static void main (String[] args)
{
String s="12we3t4i234";

int sum=0;
String s1="";

for(char c: s.toCharArray())
{
	if(Character.isDigit(c))
	{
	sum+= Character.getNumericValue(c);
	}
	else
	{
		s1=s1.concat(Character.toString(c));
		
	}
	
}
System.out.println(sum);
System.out.println(s1);
System.out.println(" count of Dupliacte words in a sentence");
DupsWords();


}

public static void DupsWords()
{
	String sample="i am in i i am india india in";
	String s2[]=sample.split(" ");
	int count=1;
	
	for (int i=0;i<s2.length;i++)
	{
		for(int j=i+1;j<s2.length;j++)
		{
			if(s2[i].equals(s2[j]))
			{
				count=count+1;
				s2[j]="0";
			}
			System.out.println(s2[j]);
			
		
		}
		if(s2[i]!="0")
		System.out.println("number repeated: "+s2[i]+" "+count+" times");
		count=1;
	}
}


}


