package utilitiesDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
//		
//		Thread.sleep(3000);
//		
//		By footerClick=By.cssSelector("li>a[href='/en/company/about-us/'][target]");
	//	waitForElementandClick(2000,footerClick);
	//	Actions act=new Actions(driver);
	//	act.scrollToElement(driver.findElement(footerClick)).click(driver.findElement(footerClick)).build().perform();
	//	Thread.sleep(3000);
		
		
	//	driver.findElement(footerClick).click();
	
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//		act.scrollToElement(driver.findElement(footerClick)).perform();	
//		wait.until(ExpectedConditions.elementToBeClickable(footerClick)).click();
//		
		ElementUtil util=new ElementUtil(driver);
		
		By footerLinks=By.xpath("//div[@class='row']//ul/li/a");
		List<WebElement> listOffooterLinks=util.WaitForElementsVisisbility(footerLinks,5);
		int count= listOffooterLinks.size();
		System.out.println(count);
		
		for(WebElement e:listOffooterLinks)
		{
			String text=e.getText();
			System.out.println(text);
		}
		
		
		
		//Select select=new Select();
//		By country=By.cssSelector("select>option");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		List<WebElement> countryList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(country));
//		List<WebElement> countryList=driver.findElements(By.cssSelector("select>option"));
//		
//		System.out.println(countryList.size());
//		
//		for(WebElement e:countryList)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.contains("Algeria"))
//			{
//				e.click();
//				break;
//			}
//		}
	
	}
	
	public static void waitForElementandClick(int time,By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	

}
