package day1.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sathiya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("narayanan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sathya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Grocery");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("lorem ispum sample text");
		driver.findElement(By.name("primaryEmail")).sendKeys("ssnsathi125@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(state);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);

	}

}


