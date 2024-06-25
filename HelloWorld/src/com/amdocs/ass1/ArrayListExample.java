package com.amdocs.ass1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Nagpur");
		list.add("Mumbai");
		list.add("Indore");
		list.add(2,"Dehli");
		
		ArrayList<String> listAnother=new ArrayList<String>();
		listAnother.add("Nagpur");
		listAnother.addAll(list);
		
		
		/*System.out.println(list);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println("Using Enchnaced For Loop Since java 1.5");
		for(String item:list)
			System.out.println(item);
		
		System.out.println("Using Enchnaced For Loop Since java before 1.5");
		Iterator<String > it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Using Enchnaced For Loop Since java 1.8");
		list.forEach(data->System.out.println(data));
		*/
		System.out.println(list.contains("Mumbai4"));
		
		
		

	}

}
