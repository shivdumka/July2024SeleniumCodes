package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendCapitalKeysUsingActionsClass {

	public static void main(String[] args) 
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			WebElement ele=driver.findElement(By.id("input-firstname"));
			Actions act=new Actions(driver);
//			act.keyDown(ele, Keys.SHIFT)
//				.sendKeys("Shivam")
//				.keyUp(Keys.SHIFT)
//				.build()
//				.perform();
			
			//above and down both functionality will work,difference is we've used ele in keydown in above and ele in sendkeys down
			
			
			act.keyDown(Keys.SHIFT)
				.sendKeys(ele,"shivam")
				.keyUp(Keys.SHIFT)
				.perform();
	
	}

}
