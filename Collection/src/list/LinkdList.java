package list;

import java.util.LinkedList;

/**
 * Simple Java program for LinkedList
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class LinkdList
{
	public static void main(String[] args) 
	{
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("1");
		l1.add("22");
		l1.add("33");
		
		l1.add(1,"44");		//we can insert value using index
		
		for(String s:l1)
		{
			System.out.println(s);
		}
		
		

	}

}
