package week2.assignment2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method sstub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sathya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("narayanan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8870682402");
		driver.findElement(By.id("password_step_input")).sendKeys("Demo@123");
		driver.findElement(By.xpath("//select[@id='day']/option[@value='24']")).click();
		driver.findElement(By.xpath("//select[@id='month']/option[@value='11']")).click();
		driver.findElement(By.xpath("//select[@id='year']/option[@value='2000']")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	  //driver.findElement(By.xpath("//a[text()='No, Create New Account']")).click();
		
	}

}
