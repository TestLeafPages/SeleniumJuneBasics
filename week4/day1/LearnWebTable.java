package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	// Find the table
	WebElement eleTable = driver.findElement(By.id("table_id"));
	// From the table, find the rows
	List<WebElement> allRows = eleTable.findElements(By.tagName("tr"));
	System.out.println("No. of rows available in the table: "+allRows.size());
	
	for (int i = 1; i < allRows.size(); i++) {
		WebElement eachRow = allRows.get(i);
		List<WebElement> allCols = eachRow.findElements(By.tagName("td"));
		System.out.println(allCols.get(0).getText());
	}
	
	
	
	
	
		/*
		 * for (int i = 1; i < allRows.size(); i++) { WebElement eachRow =
		 * allRows.get(i); List<WebElement> allCols =
		 * eachRow.findElements(By.tagName("td")); for (int j = 0; j < allCols.size();
		 * j++) { WebElement cell = allCols.get(j);
		 * System.out.print(cell.getText()+"\t"); } System.out.println(""); }
		 */
	//System.out.println("No. of columns available in the row: "+allCols.size());
	
	
	
	
	
	
	
	
	
	
	
}
}
