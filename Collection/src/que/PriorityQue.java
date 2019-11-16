package que;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Simple Java program for PriorityQueue
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class PriorityQue 
{

	public static void main(String[] args)
	{
		PriorityQueue<String> p=new PriorityQueue<String>();
		
		p.add("12");
		p.add("13");
		p.add("14");
		p.add("15");
		
		for(String str:p)
		{
			System.out.println(str);
		}
		p.add("17");
		System.out.println("Size of the Queue:"+p.size());
		
		System.out.println("First element in the queue:"+p.peek());

		System.out.println("1 stElement remove:"+p.remove());
		
		System.out.println("Size of the Queue:"+p.size());
		
		Iterator<String> i=p.iterator();
		
		System.out.println("After deletion:");
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
	}

}
