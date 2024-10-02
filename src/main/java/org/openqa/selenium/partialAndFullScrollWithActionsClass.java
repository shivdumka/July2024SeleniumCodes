package org.openqa.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class partialAndFullScrollWithActionsClass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
		//Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
		
		//For scrolling to the footer of the page
		
//		act.sendKeys(Keys.CONTROL)
//			.sendKeys(Keys.END)
//			.perform();
		
//		act.sendKeys(String.valueOf('\u0066'))
//		.sendKeys(Keys.END)
//		.sendKeys(Keys.DOWN)
//		.keyUp(Keys.getKeyFromUnicode('F'))
//		.perform();
	
		
		//Thread.sleep(2000);
		
		//For scrolling to the header of the page
		
		act.sendKeys(String.valueOf('\u0066'))
			.sendKeys(Keys.END)
			.perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL)
		.sendKeys(Keys.HOME)
		.perform();

		
		

	}

}
