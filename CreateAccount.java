package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		//maximize browser window
		driver.manage().window().maximize();
        // enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// enter password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRM/SFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// click account tab
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Prakashkumar");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium automation tester");
		//Enter a Number Of Employees
		driver.findElement(By.name("numberEmployees")).sendKeys("50");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Print theTitle name.
		System.out.println("Title name: "+ driver.getTitle());
		//Close the browser window
		driver.close();
		
		
	}

}
