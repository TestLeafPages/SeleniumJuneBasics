package week3.day1;

public class Login {
public static void main(String[] args) {
	GoogleChromeDriver driver = new GoogleChromeDriver();
	driver.launchApp();
	driver.get("www.google.com");
	driver.close();
}
}
