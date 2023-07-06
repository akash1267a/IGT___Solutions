package com;

import java.util.*;
class A1
{
	A1()
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		//al.add("ABC");
		al.add(300);
		al.add(400);
		al.add(700);
		al.add(2,456);
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Date d = new Date();
		System.out.println(d);
	}
}
public class Demo27 {

	public static void main(String[] args) {
		{
			A1 a = new A1();
		}
		

	}

}
