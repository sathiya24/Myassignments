package week2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {;
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
	    driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
	    driver.findElement(By.xpath("//a/span[text()='Skybags']")).click();
	    driver.findElement(By.xpath("//a/span[text()='American Tourister']")).click();
	    System.out.print(driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText());
	    
	    

	}

}
