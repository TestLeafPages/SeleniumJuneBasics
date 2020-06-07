package week1.day2;

public class SumOfDigits {
public static void main(String[] args) {
	int number = 56937, solution = 0 ;
	// 5 + 6 + 9 = 20
	while(number>0)
	{
	int lastdigit = number % 10;
	solution = solution + lastdigit ;
	number = number / 10;
	System.out.println("Solution: "+solution+" Number: "+number);
	}
	
}
}
