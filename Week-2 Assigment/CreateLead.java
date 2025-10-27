package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		// maximize browser window
		driver.manage().window().maximize();
		// enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// enter password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// click login
		driver.findElement(By.className("decorativeSubmit")).click();
		// CRM/SFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Click on the "Leads" tab
		driver.findElement(By.linkText("Leads")).click();
		// Click on the "Create Lead" button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prakash");
		//Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8883865313");

		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		//Click the "Create Lead" button
		driver.findElement(By.className("smallSubmit")).click();
		// Print theTitle
		System.out.println("Title name :" + driver.getTitle());
		// Close the browser window.
		driver.close();

	}

}
