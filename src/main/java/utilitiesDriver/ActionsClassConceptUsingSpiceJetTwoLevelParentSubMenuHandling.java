package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassConceptUsingSpiceJetTwoLevelParentSubMenuHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
//		WebElement addOns=driver.findElement(By.xpath("//div[text()='Add-ons']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(addOns).perform();
//		
//		Thread.sleep(3000);
//		
//		
//		WebElement visaServices=driver.findElement(By.xpath("//div[text()='Visa Services']"));
//		visaServices.click();
		
		//Generic method for parent-sub menu handling using Actions class
		//parentChildMenuHandling("Add-ons","Visa Services");
		//parentChildMenuHandling("SpiceClub","Benefits");
		
		
		By parentLocator=By.xpath("//div[text()='SpiceClub']");
		By childLocator=By.xpath("//div[text()='Benefits']");
		parentChildMenuHandling(parentLocator,childLocator);
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static void parentChildMenuHandling(String HoverToParentMenu,String clickOnSubMenu) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(getElement(By.xpath("//div[text()='"+HoverToParentMenu+"']"))).perform();
		Thread.sleep(2000);
		getElement(By.xpath("//div[text()='"+clickOnSubMenu+"']")).click();
	}
	
	public static void parentChildMenuHandling(By HoverToParentMenu,By clickOnSubMenu) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(getElement(HoverToParentMenu)).perform();
		Thread.sleep(2000);
		getElement(clickOnSubMenu).click();
	}
	
}
