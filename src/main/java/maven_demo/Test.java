package maven_demo;

import java.util.Arrays;
import java.util.HashSet;

public class Test {
	//static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int z=45;
	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		//System.out.println(array);
		System.out.println(Arrays.toString(array));
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(array));
		System.out.println(set);
		boolean[] arr= {true,false};
		System.out.println(Arrays.toString(arr));
		
		
		int a=0;
		int b=1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<10;i++)
		{
			c=a+b;
			
			a=b;
			b=c;
			
			System.out.println(c);
		}
		
		
		
	}
}
