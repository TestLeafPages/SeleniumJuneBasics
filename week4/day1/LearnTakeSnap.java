package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTakeSnap {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement eleFrame = driver.findElementByClassName("demo-frame");
	driver.switchTo().frame(eleFrame);
	WebElement ele = driver.findElement(By.xpath("//li[text()='Item 1']"));
	ele.click();
	File snap0 = ele.getScreenshotAs(OutputType.FILE);
	File image0 = new File("./snaps/image0.jpg");
	FileUtils.copyFile(snap0, image0);
	
	
	
	// press the printscreen - capture the image as a file
	File snap = driver.getScreenshotAs(OutputType.FILE);
	File image = new File("./snaps/image.jpg");
	FileUtils.copyFile(snap, image);
	
}
}
