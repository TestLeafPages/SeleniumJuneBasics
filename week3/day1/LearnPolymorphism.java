package week3.day1;

public class LearnPolymorphism {
public int add() {
	System.out.println(5+4);
	return 4+5;
}
public void add(int a, int b) {
	System.out.println(a+b);
}
public void add(int a, int b,int c) {
	System.out.println(a+b+c);
}
public void add(double a, double b) {
	System.out.println(a+b);
}
public static void main(String[] args) {
	LearnPolymorphism obj = new LearnPolymorphism();
	obj.add();
	obj.add(5, 5);
	obj.add(5, 4, 3);
	obj.add(1.234, 2.345);
}

}
