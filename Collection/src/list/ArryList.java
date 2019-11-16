package list;

import java.util.*;

/**
 * Simple Java program for ArrayList
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class ArryList 
{
	public static void main(String[] args) 
	{
		System.out.println("Integer Type elements to be stored in ArrayList object a:");
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(123);
		a.add(1);
		a.add(12);
		
		
		System.out.println(a);
		
		for(int str:a)
		{
			System.out.println(str);
		}
		
		System.out.println("Size of the Array:"+a.size());

		a.remove(0);
		a.remove(1);
		
		
		for(int str:a)
		{
			System.out.println(str);
		}
		
		System.out.println("String of elements to be Stored in ArrayList object a2:");
		
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("Gopal");
		a1.add("1");
		a1.add("k2k");
		a1.add("har1");
		
		System.out.println(a1);
		
		for(String str:a1)
		{
			System.out.println(str);
		}
		
		System.out.println("Size of the Array:"+a1.size());

		a1.remove(0);
		a1.remove("k2k");
		
		
		for(String str:a1)
		{
			System.out.println(str);
		}

		
		
		

	}
}