package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignMultipleBrowserPopUpHandleWrongApproach2 {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		//As soon as browser opens up and above URL gets hit,a window ID will be generated for this parent Window,which we can store in String variable which we can.....
		//....use when inside the loop we want all other windows to close except the parent Window
		
		String parentWindowID=driver.getWindowHandle();
		
		 
		 
		//1.Child Window Tab open,fetch the title and print the title,switch back to parent window tab and click on next link to open another child window tab
		 
		WebElement execProfile=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='Executive Profile') and @href='/en/company/executive-profiles/']"));
		
		Actions act=new Actions(driver);
		
		act.click(execProfile).perform();
		
		Thread.sleep(3000);
	
		String execProfWindowID=driver.getWindowHandle();
		
		driver.switchTo().window(execProfWindowID);
		
		String execuProftitle=driver.getTitle();
		System.out.println(execuProftitle);
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindowID);
		
		//2
		WebElement csSupporte=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='CS & Support') and @href='/en/why-orangehrm/switch-to-orangehrm/service-and-support/']"));
		
		act.click(csSupporte).perform();
		
		Thread.sleep(3000);
		
		String csSupportWindowID=driver.getWindowHandle();
		driver.switchTo().window(csSupportWindowID);
		
		String csSupporttitle=driver.getTitle();
		System.out.println(csSupporttitle);
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindowID);
		
		
		//3
		WebElement pressReleases=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='Press Releases') and @href='/en/company/press-releases/']"));
		
		act.click(pressReleases).perform();
		
		Thread.sleep(3000);
		
		String pressReleasesWindowID=driver.getWindowHandle();
		driver.switchTo().window(pressReleasesWindowID);
		
		String pressReleasetitle=driver.getTitle();
		System.out.println(pressReleasetitle);
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindowID);
		
		//4
		WebElement NewsArticles=driver.findElement(By.xpath("//footer/section//a[normalize-space(text()='News Articles') and @href='/en/company/news-articles/']"));

		act.click(NewsArticles).perform();
		
		Thread.sleep(3000);
		
		String NewsArticlesWindowID=driver.getWindowHandle();
		driver.switchTo().window(NewsArticlesWindowID);
		
		String NewsArticlestitle=driver.getTitle();
		System.out.println(NewsArticlestitle);
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindowID);
		
		//Coming back to parent window
		//Printing title of parent
		String ParentWindowtitle=driver.getTitle();
		System.out.println(ParentWindowtitle);
		
		
	}

}
