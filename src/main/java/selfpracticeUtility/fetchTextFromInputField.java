package selfpracticeUtility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchTextFromInputField {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
//		driver.findElement(By.id("APjFqb")).sendKeys("Olympics 2024");
//		String text=driver.findElement(By.id("APjFqb")).getAttribute("value");
//		System.out.println(text);
		
//		By textValue=By.id("APjFqb");
//		doSendKeys(textValue,"Olympics 2024");
//		doGetAttribute(textValue,"value");
		
		By linkList=By.tagName("a");
		int countLinkList=giveListCount(linkList);
		System.out.println(countLinkList);
		List<String> finalLinksList=fetchTextOfLinks(linkList);
		System.out.println(finalLinksList);
		printElementList(linkList);
		boolean elec=fetchTextOfLinks(linkList).contains("Electronics");
		System.out.println(elec);
	}	
		public static WebElement findWebElement(By locator)
		{
			return driver.findElement(locator);
		}
		public static void doSendKeys(By locator,String value)
		{
			findWebElement(locator).sendKeys(value);
		}
		
		public static void doGetAttribute(By locator,String attribute)
		{
			 String attributeValue=findWebElement(locator).getAttribute(attribute);
			 System.out.println(attributeValue);
		}
		
		public static List<WebElement> getElements(By locator)
		{
			return driver.findElements(locator);
		}
		
		public static int giveListCount(By locator)
		{
			return getElements(locator).size();
		}
		
		public static List<String> fetchTextOfLinks(By locator)
		{
			List<WebElement> listOfLinks=getElements(locator);
			List<String> webElementToStringList=new ArrayList<String>();
			for(int i=0;i<=giveListCount(locator)-1;i++)
			{
				String listElement= listOfLinks.get(i).getText();
				if(listElement.length()>0)
				{
						webElementToStringList.add(listElement);
				}
			}
	
			return webElementToStringList;
		}
		
		public static void printElementList(By locator)
		{
			List<String> printStringList=fetchTextOfLinks(locator);
			
			for(String e:printStringList)
			{
				System.out.println(e);
			}
		}
	

}
