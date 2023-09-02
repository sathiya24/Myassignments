package day1.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.name("departmentName")).sendKeys("Revenue");
		driver.findElement(By.name("description")).sendKeys("Revenue Department");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ssnsathi125@gmail.com");
		WebElement dropDownSP = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sec = new Select(dropDownSP);
		sec.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("updated");
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
