package org.openqa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabbingInActions {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException 
		{
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			WebElement ele=driver.findElement(By.id("input-firstname"));
			
			Actions act=new Actions(driver);
//			act.scrollToElement(ele)
//				.click(ele)
				act.sendKeys(ele,"Shiva")
//				.sendKeys("Shivam")
				.sendKeys(Keys.TAB)
				.sendKeys("Automation")
				.sendKeys(Keys.TAB)
				.sendKeys("shivaautomation@gmail.com")
				.sendKeys(Keys.TAB)
				.sendKeys("98987875543")
				.sendKeys(Keys.TAB)
				.sendKeys("shivam@123")
				.sendKeys(Keys.TAB)
				.sendKeys("shivam@123")
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.SPACE)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		}

}
