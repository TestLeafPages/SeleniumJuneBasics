package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// It will a new chrome browser
	ChromeDriver driver = new ChromeDriver();
	// To load an url into the opened browser
	driver.get("http://leaftaps.com/opentaps");
	// To maximize the browser
	driver.manage().window().maximize();
	// To locate an element
	WebElement eleUsername = driver.findElementById("username");
	// To type on an element
	eleUsername.sendKeys("Demosalesmanager");
	WebElement elePassword = driver.findElementById("password");
	elePassword.sendKeys("crmsfa");
	// To click on an element
	WebElement eleLoginButton = driver.findElementByClassName("decorativeSubmit");
	eleLoginButton.click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Leads").click();
	
	driver.findElementByLinkText("Create Lead").click();
	
	driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
	driver.findElementById("createLeadForm_firstName").sendKeys("Balaji");
	driver.findElementById("createLeadForm_lastName").sendKeys("C");
	
	WebElement eleDD1 = driver.findElementById("createLeadForm_dataSourceId");
	// Type -1 eleDD1.sendKeys("Employee");
	
	Select dd = new Select(eleDD1);
	
	// Type -2 dd.selectByIndex(2);
	
	// Type -3 dd.selectByValue("LEAD_PR");
	
	// Type -4 dd.selectByVisibleText("Self Generated");
	
	
	
	
		/*
		 * driver.findElementByClassName("smallSubmit").click();
		 * 
		 * String text = driver.findElementById("viewLead_companyName_sp").getText();
		 * System.out.println(text);
		 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
