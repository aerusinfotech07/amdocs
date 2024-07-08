package com.admocs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Indore");
		cities.add("Gurgaon");
		cities.add("Nasik");
		cities.add("Gurgaon");
		/*System.out.println(cities);
		for(String city:cities)
			System.out.println(city);
		
		Iterator<String> it=cities.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		Collections.reverse(cities);
		cities.forEach(city->System.out.println(city));
		
		
	}

}
