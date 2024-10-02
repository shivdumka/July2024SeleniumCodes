package utilitiesDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email=By.id("input-email");
		By password=By.id("input-password");
		By loginBtn=By.xpath("//input[@value='Login']");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement emailID=wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		emailID.sendKeys("Shivam@gmail.com");
//		
//		driver.findElement(password).sendKeys("Shivam@123");
//		
//		driver.findElement(loginBtn).click();
//		
		wait.until(ExpectedConditions.elementToBeClickable(email));
		 explicitWaitPresenceOfElement(10,email).sendKeys("Shivam@123");

	}
	
	public static WebElement explicitWaitPresenceOfElement(long waitingTime,By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(waitingTime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public static WebElement explicitWaitVisiblityOfElement(long waitingTime,By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(waitingTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	

}
