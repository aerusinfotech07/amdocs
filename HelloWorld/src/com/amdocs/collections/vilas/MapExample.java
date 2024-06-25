package com.amdocs.collections.vilas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.amdocs.ass1.Employee;

public class MapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> maps=new LinkedHashMap<Integer, String>();
		maps.put(101, "Ram");
		maps.put(105, "Shyam");
		maps.put(103, "Sita");
		maps.put(102, "Ravan");
		
	Set<Entry<Integer, String>>	entrySet=maps.entrySet();
	for(Entry entry:entrySet)
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}	
	
	Set<Integer> keys=maps.keySet();
	for(Integer k:keys)
	{
		System.out.println(k+" "+maps.get(k));
	}
		//System.out.println(maps);
		
		LinkedHashMap<Integer, Employee> mapsObject=new LinkedHashMap<Integer, Employee>();
		mapsObject.put(101,new Employee(101, "Ramesh", 20000, "Mumbai"));
		
		LinkedHashMap<Integer, ArrayList<Employee>> mapsObject2=new LinkedHashMap<Integer, ArrayList<Employee>>();
		
		

	}

}
