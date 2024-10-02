package utilitiesDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
//This alertIsPresent checks for an alert on the browser and automatically switches to the alert,and until() in this case returns alert 
		//reference variable which we can store and operate on alerts.
		
//		

		WebDriver frameDriver= wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
		String text=frameDriver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
	}
	
	public static Alert waitForAlertAndSwitchUsingAlertIsPresent(long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void getAlertTextUsingAlertIsPresent(long timeout)
	{
		Alert alert=waitForAlertAndSwitchUsingAlertIsPresent(timeout);
		String text=alert.getText();
		System.out.println(text);
	}
	
	public static void acceptAlertUsingAlertIsPresent(long timeout)
	{
		Alert alert=waitForAlertAndSwitchUsingAlertIsPresent(timeout);
		alert.accept();
	}
	
	public static void dismissAlertUsingAlertIsPresent(long timeout)
	{
		Alert alert=waitForAlertAndSwitchUsingAlertIsPresent(timeout);
		alert.dismiss();
	}
	
	public static void promptSendKeysAlertUsingAlertIsPresent(long timeout,String promptTextValueSendKeys)
	{
		Alert alert=waitForAlertAndSwitchUsingAlertIsPresent(timeout);
		alert.sendKeys(promptTextValueSendKeys);
	}
	
	

}
