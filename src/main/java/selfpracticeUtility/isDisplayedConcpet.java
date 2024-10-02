package selfpracticeUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedConcpet {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://ssc.gov.in/login");
		Thread.sleep(4000); //https://naveenautomationlabs.com/opencart/index.php?route=account/register
		driver.getTitle();
		driver.getCurrentUrl();
		
		//Is Enabled Method
		By pass=By.className("btn btn-save");
		Boolean flag=isElementEnabled(pass);
		System.out.println(flag);
		if(flag.equals(true))
		{
			System.out.println("Text field is enabled");
		}
		else
		{
			System.out.println("Text field is disabled");
		}
		
		
//		IsDisplayed method
//		By isImageDisplayed=By.className("img-responsive11");
//		Boolean flag=isitDisplayed(isImageDisplayed);
//		if(flag)
//		{
//			System.out.println("Image is displayed");
//		}
//		else 
//		{
//			System.out.println("Image is not displayed");
//		}
		
//		//IsSelected method
//		By agree=By.name("agree");
//		findWebElement(agree).click();
//		boolean flag=isSelected(agree);
//		System.out.println(flag);
		
	}
	
	public static WebElement findWebElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static boolean isitDisplayed(By locator)
	{
		try 
		{
			return findWebElement(locator).isDisplayed();
			
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element not found");
			return false;
		}
	}
	
	public static boolean isElementEnabled (By locator)
	{
		return findWebElement(locator).isEnabled();
		
	}
	
	public static boolean isSelected(By locator)
	{
		return findWebElement(locator).isSelected();
	}
}
