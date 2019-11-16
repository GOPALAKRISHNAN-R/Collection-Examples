package list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Simple Java program for ArrayList
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class RetainAl 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Ak");
		al.add("Bk");
		al.add("Ck");
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Dk");
		a.add("Ak");
		
		al.retainAll(a);   //retain all
		
		
		Iterator<String> i=al.iterator();
		
		while(i.hasNext())
				
		{
			
			System.out.println(i.next());
			
		}

	}

}
