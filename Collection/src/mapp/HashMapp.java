package mapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Simple Java program for HashMap
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class HashMapp 
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		HashMap m=new HashMap();
		
		m.put(3,"Gopal:28");
		m.put(2,"Hari");
		m.put(1, "Ragul");
		
		Set s=m.entrySet();
		
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+":");
			System.out.print(me.getValue()+"\n");
		}
		

	}

}
