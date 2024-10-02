package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashTextFieldAndSendKeys {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//JavascriptExecutor js=(JavascriptExecutor)driver;
	//	flashElement(driver.findElement(By.id("input-firstname")));
		flashElements(driver.findElement(By.id("input-firstname")));
		
		
		
	}
	
//	public static WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//	}
	
//	public static void flashElement(WebElement element)
//	{
//		String elementDefaultColor=element.getCssValue("backgroundColor");
//		for(int i=0;i<=100;i++)
//		{
//			changeColor("rgb(0,200,0)",element);
//			changeColor(elementDefaultColor,element);	
//		}
//	}
//	
//	public static void changeColor(String color,WebElement element)
//	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
//		
//		try 
//		{
//			Thread.sleep(20);
//		}
//		catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
//	}

	
	
	public static void flashElements(WebElement element)
	{
		String defaultColorOfTextField=element.getCssValue("backgroundValue");
		for(int i=0;i<=100;i++)
		{
			changeColor("rgb(0,300,0)",element);
			changeColor(defaultColorOfTextField,element);
		}
	}
	
	public static void changeColor(String color,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		try
		{
			Thread.sleep(20);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception thrown");
			e.printStackTrace();
		}
	}
}
