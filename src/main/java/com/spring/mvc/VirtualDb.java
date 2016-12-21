package com.spring.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualDb {
	
	public static Map<String, List<String>> browsingMap = new HashMap<String, List<String>>();
	public static List<String> browsingList = new ArrayList<String>();
	
	
	static{
		browsingList.add("Mac Os");
		browsingList.add("Iphone 7s");
		
		browsingMap.put("Jayavardhan", browsingList);
	}

	public static List<String> getBrowsingHistory(String key){
		return browsingMap.get(key);
	}
}
