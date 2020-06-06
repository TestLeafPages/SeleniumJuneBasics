package week1.day1;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	String[] name = {"Balaji","Dhivya","Naveen","Sam","Sarath"};
	System.out.println(name.length);
	for(int i = 0; i < name.length; i++ ) {
	System.out.println(name[i]);
	}
//	System.out.println(name[5]);
	
	int[] array = new int[5];
	array[0] = 54;
	array[1] = 36;
	array[2] = 73;
	array[3] = 101;
	array[4] = 22;
	Arrays.sort(array);
	for (int i = array.length-1; i >= 0; i--) {
		System.out.println(array[i]);
	}
	
	
}
}
