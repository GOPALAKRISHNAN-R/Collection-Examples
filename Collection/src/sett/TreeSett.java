package sett;

import java.util.TreeSet;

/**
 * Simple Java program for TreeMap
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class TreeSett 
{

	public static void main(String[] args)
	{
		TreeSet<Integer> h=new TreeSet<Integer>();
		
		h.add(1);
		h.add(1);
		h.add(22);
		h.add(2);
		h.add(12);
		
		for(int i:h)
		{
			System.out.println(i);
		}

	}

}
