package utilitiesDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowPopUpHandling {

	static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		WebElement execProfile=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='Executive Profile') and @href='/en/company/executive-profiles/']"));

//This click not working so lets use actions class click		
		//execProfile.click(); 		//New Browser window tab gets opened but still our driver is in the parent web page,so lets switch it to child window tab
		
		Actions action=new Actions(driver);
		action.click(execProfile).perform();
		//Need to get Parent and Child window ID
		Set<String> getWindowsID=driver.getWindowHandles();
		
		//Set is an unordered and non-duplicate collection of values therefore it needs to be iterated
		//Set creates two segment one for parentID and another for childID
		//This unordered collection of values cannot be accessed via for loop,it has an special method called .iterator which returns Iterator of String type
		
		Iterator<String> windowID=getWindowsID.iterator();
		
		//windowID will go and sit just above the 1st segment i.e.parentID segment
		//Now below we'll use windowID.next() where next() method will do two tasks:
		//1st Task of .next()-->it will go to the next segment i.e.1st segment 
		//2nd Task of .next()-->It will fetch the value of 1st segment
		
		String parentWindowID=windowID.next();
		System.out.println("Parent WIndow ID is: "+parentWindowID);
	
		String childWindowID=windowID.next();
		System.out.println("Child WIndow ID is: "+childWindowID);
	
		//Now we have ParentWindowID and ChildWindowID therefore we can now switch our driver from Parent Window to Child Window
		
		driver.switchTo().window(childWindowID);
		String childWebPageTitle=driver.getTitle();
		System.out.println("Child Window WebPage Title: "+childWebPageTitle);
		
		//Now we will close the child Window title,so using driver.close(),dont use driver.quit() as it will close both child as well as parent window
		driver.close();
		
		//Now our driver is lost as we closed the child window,so need to switch and redirect driver to the parent window
		
		driver.switchTo().window(parentWindowID);
		
		String parentWebPageTitle=driver.getTitle();
		System.out.println("Parent Window WebPage Title: "+parentWebPageTitle);
		
		driver.quit();
		
		
		
		
		
		
	}

}
