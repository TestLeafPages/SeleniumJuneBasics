package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.findElementByXPath("//button[text()='Prompt Box']").click();
	
	driver.findElementByXPath("//button[text()='Alert Box']").click();
		/*
		 * Alert alert = driver.switchTo().alert(); String alertText = alert.getText();
		 * System.out.println(alertText); alert.sendKeys("Testleaf New");
		 * alert.accept();
		 */
}
}
