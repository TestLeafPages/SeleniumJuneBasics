package week3.day1;

public class LearnStatic {
public int number1 = 10; // Normal variable
public static int number2 = 10; // Static variable

public void change() {
	number1+=5;
	number2+=5;
}
public static void update() {
	System.out.println("Hey");
}

public static void main(String[] args) {
	update();
	LearnStatic obj1 = new LearnStatic();
//	System.out.println(obj1.number1);
//	System.out.println(LearnStatic.number2);
//	System.out.println(number2);
	obj1.change();
	System.out.println(obj1.number1);
	LearnStatic obj2 = new LearnStatic();
	System.out.println(obj2.number1);
	System.out.println(number2);
	
}
}
