package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebElement eleFrame = driver.findElementByClassName("demo-frame");
	driver.switchTo().frame(4);
	driver.findElement(By.xpath("//li[text()='Item 1']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Download")).click();
}
}
