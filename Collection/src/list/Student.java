package list;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Simple Java program for ArrayList
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Student 
{	
	int rollno;
	String Name;
	int age;
	
	Student(int r,String n,int a)
	{
		
		rollno=r;
		Name=n;
		age=a;
		
	}

	public static void main(String[] args) 
	{
		
		Student s1=new Student(12,"Gopal",18);
		Student s2=new Student(13,"Hari",21);
		Student s3=new Student(14,"Krish",10);
		
		
		ArrayList<Student> a=new ArrayList<Student>();
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		Iterator<Student> i=a.iterator();
		
		while(i.hasNext())
		{
			Student st=(Student)i.next();
			System.out.println(st.rollno+" "+st.Name+" "+st.age);
		}

	}

}
