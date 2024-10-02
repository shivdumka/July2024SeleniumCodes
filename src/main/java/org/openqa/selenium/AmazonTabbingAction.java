package org.openqa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTabbingAction 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement ele=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(ele,"Macbook M1")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
		
	}	
}
