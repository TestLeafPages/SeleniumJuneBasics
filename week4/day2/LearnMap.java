package week4.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
public static void main(String[] args) {
	Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	map.put("iphone", 50000);
	map.put("blackberry",30000);
	map.put("One Plus",40000);
	map.put("Samsung",75000);
	map.put("One Plus",60000);
	System.out.println(map);
//	Set<Entry<String, Integer>> entrySet = map.entrySet();
		/*
		 * for(Entry<String, Integer> eachEntry : map.entrySet()) {
		 * System.out.println(eachEntry.getKey()+" -> "+eachEntry.getValue()); }
		 */
	map.remove("One Plus");
	Set<String> keys = map.keySet();
	for (String eachKey : keys) {
		System.out.println(eachKey+" -> "+map.get(eachKey));
	}
	
	
	
	
	
		/*
		 * System.out.println(map.get("iphone"));
		 * System.out.println(map.containsKey("Samsung"));
		 * System.out.println(map.containsValue(75000));
		 */
}
}
