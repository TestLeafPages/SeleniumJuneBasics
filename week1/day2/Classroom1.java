package week1.day2;

public class Classroom1 {
public int addTwoNumbers(int a, int b) {
	return a+b;
}
public int subTwoNumbers(int a, int b) {
	return a-b;
}
public int multiplyTwoNumbers(int a, int b) {
	return a*b;
}
public int divideTwoNumbers(int a, int b) {
	return a/b;
}
public static void main(String[] args) {
	Classroom1 obj = new Classroom1();
	int sum = obj.addTwoNumbers(20, 7);
	System.out.println("Sum of two numbers: "+sum);
	int difference = obj.subTwoNumbers(15, 7);
	System.out.println("Difference of Two numbers: "+difference);
	int product = obj.multiplyTwoNumbers(4, 5);
	System.out.println("Multiplication of two numbers: "+product);
	int division = obj.divideTwoNumbers(27, 3);
	System.out.println("Division of two numbers: "+division);
	
	
	

}
}
