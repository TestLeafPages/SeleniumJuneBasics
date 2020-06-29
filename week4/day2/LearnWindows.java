package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	String currentWindowRef = driver.getWindowHandle();
	Set<String> setWindows = driver.getWindowHandles();
	for (String eachwindow : setWindows) {
		driver.switchTo().window(eachwindow);
		if(driver.getTitle().contains("Sopra Banking")) {
			break;
		}
	}
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// System.out.println(currentWindowRef);
		/*
		 * Set<String> allwindowref = driver.getWindowHandles(); List<String> list = new
		 * ArrayList<String>(allwindowref); String desiredWindow = list.get(1);
		 * driver.switchTo().window(desiredWindow);
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(list.get(0)); System.out.println(driver.getTitle());
		 */
	//driver.quit();
	
	
	
	
	

	
	
}
}
