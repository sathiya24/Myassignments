package week2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("j_idt88:name")).sendKeys("sathya");
		Thread.sleep(3000);
		driver.findElement(By.name("j_idt88:j_idt91")).clear();
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("india");
		System.out.println(driver.findElement(By.name("j_idt88:j_idt93")).isEnabled());
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value"));
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("ssnsathi125@gmail.com");
		driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("QA Tester");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("sample text");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys(Keys.ENTER);
		
		

	}

	
}
