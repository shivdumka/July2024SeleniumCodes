package utilitiesDriver;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/login.cfm?pr=1");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
//		if(wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support.")));
//		{
//			System.out.println(driver.getTitle());
//		}
		
//		boolean flag=false;
//		
//		try 
//		{
//			wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."));
//			flag=true;
//		
//		}
//		catch(TimeoutException e)
//		{
//			System.out.println("----Wrong Title-----");
//		}
//		
//		if(flag)
//		{
//			System.out.println("Correct title");
//		}
//		else 
//		{
//			System.out.println("Incorrect Title");
//		}
		
	//	waitForTitle("Free CRM software for customer relationship management, sales, and support",5);
		//getTitleIs("Free CRM software for customer relationship management, sales, and support",5);
		
		getTitleContains("CRM softwre",3);
		
		ElementUtil util=new ElementUtil(driver);
		util.getURLContains("login.cfm",3);
	}




	public static boolean waitForTitleIs(String title,long waitingTime) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(waitingTime));
		
	
		
		try 
		{
			wait.until(ExpectedConditions.titleIs(title));
			//flag=true;
			return true;
		
		}
		catch(TimeoutException e)
		{
			System.out.println("----Wrong Title-----");
			return false;
		}
	}
	
	
	public static void getTitleIs(String title,long waitingTime)
	{
		boolean flag=waitForTitleIs(title,waitingTime);
		if(flag==true)
		{
			System.out.println(driver.getTitle());
		}
		else 
		{
			System.out.println("Incorrect Title,Please check your title once again in webpage");
		}
	}
	
	
	public static boolean waitForTitleContains(String fractionalTitle,long waitingTime) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(waitingTime));
		
		
		//boolean flag=false;
		
		try 
		{
			wait.until(ExpectedConditions.titleContains(fractionalTitle));
			//flag=true;
			return true;
		
		}
		catch(TimeoutException e)
		{
			System.out.println("----Wrong Title-----");
			return false;
		}
	}
	
	public static void getTitleContains(String title,long waitingTime)
	{
		boolean flag=waitForTitleContains(title,waitingTime);
		if(flag==true)
		{
			System.out.println(driver.getTitle());
		}
		else 
		{
			System.out.println("Incorrect Title,Please check your title once again in webpage");
		}
	}

}