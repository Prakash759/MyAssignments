package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		//Click on Create Lead.
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the CompanyName Field Using Xpath
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("XYZ");
		//Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Prakash");
		//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Prakash");
		//Enter the Department Field
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		//Enter the Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation tester");
		//Enter E-mail address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Prakash@gmail.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(sourceDD);
		s.selectByVisibleText("New York");
		//Click on the Create Button
		driver.findElement(By.className("smallSubmit")).click();
		//Click on the edit button
		driver.findElement(By.linkText("Edit")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Clear the Description Field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Fill the Important Note Field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description updated");
		//Click on the update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Get the Title of the Resulting Page
		System.out.println("Title name:"+ driver.getTitle());
		//Close the browser window
		driver.close();
		
		
		
		
	}

}
