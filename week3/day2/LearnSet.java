package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
public static void main(String[] args) {
	Set<String> set = new LinkedHashSet<String>();
	boolean add1 = set.add("Harry");
	System.out.println(add1);
	set.add("Adam");
	set.add("Zoe");
	set.add("Ginger");
	
	boolean add2 = set.add("Harry");
	System.out.println(add2);
	set.add("Cadbury");
	System.out.println(set);
	for (String eachName : set) {
		System.out.println(eachName);
	}
	
	//List<String> list = new ArrayList<String>(set);
	List<String> list = new ArrayList<String>();
	list.addAll(set);
	//System.out.println(list.get(1));
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
