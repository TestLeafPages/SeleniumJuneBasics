package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSortable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/sortable/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	
	WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(item1, item4.getLocation().getX(), item4.getLocation().getY()).perform();
}
}
