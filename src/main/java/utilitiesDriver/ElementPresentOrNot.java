package utilitiesDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentOrNot {
	static WebDriver driver;
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	 
	public static int elementsCount(By locator)
	{	
		return getElements(locator).size();
	}
	
	public static boolean isElementPresent(By locator,int expectedElementCount)
	{
		if(elementsCount(locator)==expectedElementCount)
		{
			return true;
		}
			return false;
	}
	
	
	
	public static void main(String[] args) 
	
	{
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 By logoDetectPresentOrNot=By.className("img-responsive");
		 By linksDetectPresentOrNot=By.xpath("//div[@class='list-group']/a");
		 //Negative scenerio-->If element is not present then count will be zero
		 By negativeScenerioDetect=By.xpath("//div/cvab");
		 System.out.println(isElementPresent(logoDetectPresentOrNot,1));
		 System.out.println(isElementPresent(linksDetectPresentOrNot,13)); 
		 System.out.println(isElementPresent(negativeScenerioDetect,0));
		 

	}

}
