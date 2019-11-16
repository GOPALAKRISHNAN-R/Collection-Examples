package list;

import java.util.ArrayList;

/**
 * Simple Java program for ArrayList
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class AddAl 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("Gk");
		a1.add("Hk");
		a1.add("Rk");
		a1.add("kk");
		
		ArrayList<String> a2=new ArrayList<String>();
		
		a2.add("Ak");
		a2.add("Bk");
		a2.add("Gk");
		
		
		System.out.println("addAll():");
		
		a1.addAll(a2);				//addAll() a1 and a2 
		
		for(String str:a1)
		{
			System.out.println(str);
		}
		

	}

}
