package org.openqa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollToElementActions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement ele=driver.findElement(By.linkText("Corporate Information"));
		Actions act=new Actions(driver);
		//Thread.sleep(1000);
		act.scrollToElement(ele)
			.pause(200)
			.click(ele)
			.build()
			.perform();
	}

}
