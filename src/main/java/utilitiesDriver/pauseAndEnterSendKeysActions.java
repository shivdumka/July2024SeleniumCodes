package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pauseAndEnterSendKeysActions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName=driver.findElement(By.id("input-firstname"));
//		String inputFirstName="Shivam Automation";
//		char ch[]=inputFirstName.toCharArray();
//		for(char c:ch)
//		{
//			Actions act=new Actions(driver);
//		
//			act.sendKeys(firstName,String.valueOf(c)).pause(200).build().perform();
//		}
		//doPauseAndSendKeysActions(By.id("input-firstname"),"Shivam Automation",300);
		doPauseSendKeysActions(By.id("input-firstname"),"Shivam Automation",300);
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	//Using directly toCharArray() to convert a string to character array so that we can let the control write the char one by one with pause
	public static void doPauseAndSendKeysActions(By locator,String value,int durationOfPause)
	{
		
		char ch[]=value.toCharArray();
		for(char e:ch)
		{
			Actions act=new Actions(driver);
			act.sendKeys(getElement(locator),String.valueOf(e)).pause(durationOfPause).build().perform();
		}
	}

	
	//Using conventional method(w/o toCharArray) to convert a string to character array so that we can let the control.......
	//.......write the char one by one with pause
	public static void doPauseSendKeysActions(By locator,String value,int durationOfPause)
	{
		char ch[]=new char[value.length()];
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i]=value.charAt(i);
		}
		for(char e:ch)
		{
			Actions act=new Actions(driver);
			act.sendKeys(getElement(locator),String.valueOf(e)).pause(durationOfPause).build().perform();
		}
	}

}	
