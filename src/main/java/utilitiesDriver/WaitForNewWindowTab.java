package utilitiesDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForNewWindowTab {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial"); 			//Parent Window
		
		
		
		By clickFooter=By.xpath("(//div[@class='footer-main']//a[contains(text(),'OrangeHRM')])[1]");		
		WebElement clickFoot=driver.findElement(clickFooter);				
		Actions act=new Actions(driver);
		act.click(clickFoot).perform();									//Child Window
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		Boolean flag=wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		System.out.println(flag);
		
		waitForNumberOfWindowsOpened(5,3);
	}

	public static boolean waitForNumberOfWindowsOpened(int timeout,int noOfWindowsOpened)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		try
		{
			if(wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindowsOpened)));
			{
				System.out.println("Passed correct number of windows");
				return true;
			}
		}	
		catch(TimeoutException e)
		{
			System.out.println("This is incorrect number of windows passed");
			return false;
		}
		
	}
	
	

}