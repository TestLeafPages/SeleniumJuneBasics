package week1.day1;

public class LearnAccessModifiers {
public int a = 5;
private int b = 10;
int c = 20;

public static void main(String[] args) {
	LearnAccessModifiers obj = new LearnAccessModifiers();
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
}
}
