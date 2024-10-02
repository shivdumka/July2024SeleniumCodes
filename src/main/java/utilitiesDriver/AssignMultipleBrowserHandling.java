package utilitiesDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignMultipleBrowserHandling {

	static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		//As soon as browser opens up and above URL gets hit,a window ID will be generated for this parent Window,which we can store in String variable which we can.....
		//....use when inside the loop we want all other windows to close except the parent Window
		
	//	String parentWindowID=driver.getWindowHandle();
		
		WebElement execProfile=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='Executive Profile') and @href='/en/company/executive-profiles/']"));
		WebElement csSupporte=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='CS & Support') and @href='/en/why-orangehrm/switch-to-orangehrm/service-and-support/']"));
		WebElement pressReleases=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='Press Releases') and @href='/en/company/press-releases/']"));
		WebElement NewsArticles=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='News Articles') and @href='/en/company/news-articles/']"));
		
		Actions act=new Actions(driver);

		//1.
		
		act.click(execProfile).perform();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> execAndParentWindowID=handles.iterator();
		
		String parentWindowID=execAndParentWindowID.next();
		System.out.println(parentWindowID);
		
		String execWindowID=execAndParentWindowID.next();
		System.out.println(execWindowID);
		
		driver.switchTo().window(execWindowID);
		System.out.println("Child Window Tab Execute Profile Title Confirm: "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		//2
		
		act.click(csSupporte).perform();
		
		Set<String> handles1=driver.getWindowHandles();
		
		Iterator<String> csSupportAndParentWindowID=handles1.iterator();
		
		String parentWindowID2=csSupportAndParentWindowID.next();
		System.out.println(parentWindowID2);
		
		String csSupportWindowID=csSupportAndParentWindowID.next();
		System.out.println(csSupportWindowID);
		
		
		driver.switchTo().window(csSupportWindowID);
		System.out.println("Child Window Tab CS and Support Title Confirm: "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID2);
		
		//3
		act.click(pressReleases).perform();
		
		Set<String> handles3=driver.getWindowHandles();
		
		Iterator<String> pressReleasesAndParentWindowID=handles3.iterator();
		
		String parentWindowID3=pressReleasesAndParentWindowID.next();
		System.out.println(parentWindowID3);
		
		String pressReleasesWindowID=pressReleasesAndParentWindowID.next();
		System.out.println(pressReleasesWindowID);
		
		
		driver.switchTo().window(pressReleasesWindowID);
		System.out.println("Child Window Tab Press Releases Title Confirm: "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID3);
		
		
		//4
		
		act.click(NewsArticles).perform();
		
		Set<String> handles4=driver.getWindowHandles();
		
		Iterator<String> NewsArticlesAndParentWindowID=handles4.iterator();
		
		String parentWindowID4=NewsArticlesAndParentWindowID.next();
		System.out.println(parentWindowID4);
		
		String NewsArticlesWindowID=NewsArticlesAndParentWindowID.next();
		System.out.println(NewsArticlesWindowID);
		
		
		driver.switchTo().window(NewsArticlesWindowID);
		System.out.println("Child Window Tab News Articles Title Confirm: "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID4);
		
		String titleAtLast=driver.getTitle();
		System.out.println();
		System.out.println("At last returned to Parent Window and the title is: "+ titleAtLast);
	
	}
	
//	public static void handleWindowTab(String handles,String parentID,String ChildID)
//	{
//		Set<String> handles=driver.getWindowHandles();
//		
//		Iterator<String> childAndParentWindowID=handles.iterator();
//		
//		String parentWindowID=childAndParentWindowID.next();
//		System.out.println(parentWindowID);
//		
//		String childWindowID=childAndParentWindowID.next();
//		System.out.println(childWindowID);
//	}
}
