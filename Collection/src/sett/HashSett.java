package sett;

import java.util.HashSet;

/**
 * Simple Java program for HashMap
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class HashSett 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> h=new HashSet<Integer>();
		
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
