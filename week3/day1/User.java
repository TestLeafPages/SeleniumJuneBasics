package week3.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	RBI myAc = new Axis();
	myAc.openDeposits();
	System.out.println(myAc.minimumBalance);
	myAc.lendHomeLoans();
}
}
