package utilitiesDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("input-email")).sendKeys("Shivam@gmail.com");
		driver.findElement(By.id("input-password11")).sendKeys("Shivam@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
