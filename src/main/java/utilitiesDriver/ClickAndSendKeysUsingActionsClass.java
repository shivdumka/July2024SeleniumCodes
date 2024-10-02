package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeysUsingActionsClass {


		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException
		{
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			By inputName=By.xpath("//input[@id='input-firstname']");
			Thread.sleep(3000);
			By clickYes=(By.xpath("//label[normalize-space()='Yes']"));
			doActionsSendKeys(inputName,"Shivam");
			doActionsClick(clickYes);
			//Actions act=new Actions(driver);
			//act.sendKeys(driver.findElement(By.xpath("//input[@id='input-firstname']")),"Shivam").perform();	
			//act.click(driver.findElement(By.xpath("//label[normalize-space()='Yes']"))).perform();
		}
		
		public static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
		
		public static void doActionsSendKeys(By locator,String value)
		{
			Actions act=new Actions(driver);
			act.sendKeys(getElement(locator),value).perform();;
		}
		public static void doActionsClick(By locator)
		{
			Actions act=new Actions(driver);
			act.click(getElement(locator)).perform();
		}
		
		
}
