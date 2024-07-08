package com.admocs.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		TreeMap<String, List<String>> map=new TreeMap<String,List<String>>();
		List<String> areaInMumbai=new ArrayList<String>();
		map.put("400345", areaInMumbai);
		
		System.out.println(map);
		System.out.println(map.get("400345"));

	}

}
