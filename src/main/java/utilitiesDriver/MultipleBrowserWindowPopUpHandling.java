package utilitiesDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleBrowserWindowPopUpHandling {

	static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		//As soon as browser opens up and above URL gets hit,a window ID will be generated for this parent Window,which we can store in String variable which we can.....
		//....use when inside the loop we want all other windows to close except the parent Window
		
		String parentWindowID=driver.getWindowHandle();
		
		WebElement execProfile=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='Executive Profile') and @href='/en/company/executive-profiles/']"));
		WebElement csSupporte=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='CS & Support') and @href='/en/why-orangehrm/switch-to-orangehrm/service-and-support/']"));
		WebElement pressReleases=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='Press Releases') and @href='/en/company/press-releases/']"));
		WebElement NewsArticles=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='News Articles') and @href='/en/company/news-articles/']"));
	
		
		 Actions act=new Actions(driver);
		 act.click(execProfile).perform();
		 act.click(csSupporte).perform();
		 act.click(pressReleases).perform();
		 act.click(NewsArticles).perform();
		 
		 //Fetch the Window IDS of all the new window tabs popped up 4 child ID+1 parentID
		 
		 Set<String>handles=driver.getWindowHandles();
		
		 //Now we dont know how the segments have to been alloted to all the 5 IDs by the Set inside its collection "handles",we just know there are 5 segments
		 //iterator() will still be used and we have to handle all of them using while loop
		 
		 Iterator<String> windowIDsIteration=handles.iterator();
		 
		 //we will iterate until the Set has the next and the last window ID available to iterate through 
		 //hasNext() gives us the boolean value whether the set has next value available in it or not
		 
		 
		 //If() statement has been written because it will otherwise close the parent Window along with the child window...
		 //...so we have written the condition that if window id is not equal to parent id it will close the window tab i.e.close child tabs
		 
		 //We maintained a separate parentID at the start just because we needed to use it here in if() statement to prevent it from....
		 //...getting closed
		 
		 while(windowIDsIteration.hasNext())
		 {
			 String windowID=windowIDsIteration.next();
			 driver.switchTo().window(windowID);
			 String title=driver.getTitle();
			 System.out.println(title);
			 
			 if(!windowID.equals(parentWindowID))
			 {
				 driver.close();
		 
			 }
		 }
		 //Now we have all other Child window Tabs closed except the Parent Window tab,but remember our driver is lost,it has to be switched and redirected to parent window
		 
		 driver.switchTo().window(parentWindowID);
		 System.out.println("Parent window title is:"+driver.getTitle());
		 
	}

}
