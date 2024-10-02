package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketActionsClassMultiLevelHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/cl/foodgrains-oil-masala/?nc=nb");
		Thread.sleep(3000);
		
		By levelOne=By.xpath("(//span[text()='Shop by'])[2]");
		By levelTwo=By.linkText("Beverages");
		By levelThree=By.linkText("Coffee");
		By levelFour=By.linkText("Ground Coffee");
		
		shopByCategory(levelOne,levelTwo,levelThree,levelFour);

		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static void shopByCategory(By levelOne,By levelTwo,By levelThree,By levelFour) throws InterruptedException
	{
		WebElement clickFirst=getElement(levelOne);
		clickFirst.click();
		
		Thread.sleep(1500);
		
		Actions act=new Actions(driver);
		
		WebElement firstHover=getElement(levelTwo);
		act.moveToElement(firstHover).perform();
		
		Thread.sleep(1500);
		
		WebElement secondHover=getElement(levelThree);
		act.moveToElement(secondHover);
		
		Thread.sleep(1500);
		
		WebElement clickLast=getElement(levelFour);
		clickLast.click();
		
	}

}
