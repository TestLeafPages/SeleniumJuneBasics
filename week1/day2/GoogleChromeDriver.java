package week1.day2;

public class GoogleChromeDriver {
public void get(String url) {
	System.out.println("URL is loaded: "+url);
}
public String getText() {
	return "Text from WebPage";
}
public void click() {
	System.out.println("Clicked successfully");
}
public boolean isSelected() {
	return true;
}
public static void main(String[] args) {
	GoogleChromeDriver driver = new GoogleChromeDriver();
	driver.get("https://www.google.com/");
	String text = driver.getText();
	System.out.println(text);
	driver.click();
	boolean result = driver.isSelected();
	System.out.println(result);
}
}
