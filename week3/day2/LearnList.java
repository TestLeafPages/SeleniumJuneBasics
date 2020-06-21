package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		// Syntax to create the list
		List<Integer> list = new ArrayList<Integer>();
		list.add(567);
		list.add(123);
		list.add(445);
		list.add(789);
		list.add(123);
		list.add(2, 999);
		list.remove(0);
		list.set(0, 99);
		int size = list.size();
		System.out.println("Size of the list: " + size);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Integer max = Collections.max(list);
		System.out.println(max);
		list.clear();
		list.isEmpty();

		/*
		 * System.out.println("-------------------------"); // for(Datatype
		 * eachEntity:list/set/array obj) for (Integer eachInteger : list) {
		 * System.out.println(eachInteger); }
		 * 
		 * System.out.println("-------------------------");
		 * 
		 * for (int i = 0; i < size; i++) { System.out.println(list.get(i)); }
		 * System.out.println("-------------------------"); for (int i = size-1; i >= 0;
		 * i--) { System.out.println(list.get(i)); }
		 */

	}
}
