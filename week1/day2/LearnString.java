package week1.day2;

public class LearnString {
public static void main(String[] args) {
		/*
		 * String text0 = "Testleaf"; String text1 = "Testleaf"; // String literal
		 * String text2 = new String("Testleaf"); //String object String text3 = new
		 * String("Testleaf"); System.out.println(text3==text2);
		 * System.out.println(text0==text1);
		 */
	
		/*
		 * String text1 = "Testleaf is in chennai"; String text2 = "Testleaf"; int
		 * length = text1.length(); System.out.println(length); String lowerCase =
		 * text1.toLowerCase(); System.out.println(lowerCase); String upperCase =
		 * text1.toUpperCase(); System.out.println(upperCase); boolean result1 =
		 * text1.equals(text2); System.out.println(result1); boolean result2 =
		 * text1.equalsIgnoreCase(text2); System.out.println(result2); boolean result3 =
		 * text1.contains(text2); System.out.println(result3);
		 */
	
	
	String text = "Since 1995";
	String result = text.replaceAll("[^0-9]", "");
	System.out.println(result);
	
	
	
	
	
	
	
	
	
		/*
		 * String replace = text.replace('a', '@'); System.out.println(replace);
		 */		/*
		 * String[] array = text.split(" "); for (int i = 0; i < array.length; i++) {
		 * System.out.println(array[i]); }
		 */ 
	
	
	
	
	
	
		/*
		 * char[] array = text.toCharArray(); for (int i = 0; i < array.length; i++) {
		 * System.out.println(array[i]); }
		 */
	
	
		/*
		 * for(int i=0; i< text.length();i++) { char charAt = text.charAt(i);
		 * System.out.println(charAt); }
		 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
