package list;

import java.util.ArrayList;

/**
 * Simple Java program for ArrayList
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class RemoveAl {

	public static void main(String[] args)
	{
		ArrayList<String> a3=new ArrayList<String>();

		a3.add("Gk");
		a3.add("Hk");
		a3.add("Rk");
		a3.add("kk");
				
		ArrayList<String> a4=new ArrayList<String>();
		
		a4.add("Ck");
		a4.add("GK");
		
		System.out.println("removeAll():");
		
		a3.removeAll(a4);			//removeAll() a3 and a4
		
		for(String Str1:a3)
		{
			System.out.println(Str1);
		}
		

	}

}
