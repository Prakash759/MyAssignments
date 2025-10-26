package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
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
		//Click the "Leads" link.
		driver.findElement(By.linkText("Leads")).click();
		//Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8883865313");
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Click the first resulting lead.
		driver.findElement(By.xpath("//a[text()='10157']")).click();
		//Click the first resulting lead.
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		//Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10157");
		//Click the "Find leads" button.
		driver.findElement(By.linkText("Find Leads")).click();
		// Close the browser window.
	    driver.close();
	}

}
