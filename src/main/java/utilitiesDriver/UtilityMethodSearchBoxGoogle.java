package utilitiesDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityMethodSearchBoxGoogle 
{
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		By searchBar=(By.id("APjFqb"));
		By suggestionList=By.xpath("//div[@class='wM6W7d']");
		//printSuggestionListFromSearchBar(searchBar,suggestionList,"selenium");
		clickOnSuggestionFromSuggestionListInSearchBar(searchBar,suggestionList,"selenium","rich foods");
		
		//getElement(searchBar);
		//WebElement searchBar=driver.findElement(By.id("APjFqb"));
		
		//dosSendKeys(searchBar,"Selenium");
		//searchBar.sendKeys("selenium");
		
		
		//
		//getElements(suggestionList);
		//List<WebElement> suggestionList=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		
		//for printing suggestion list in the form of List of Strings
//		List<String> suggestionListString=new ArrayList<String>();
//		for(WebElement e:suggestionList)
//		{
//			String text=e.getText();
//			if(text.length()>0)
//			{
//					suggestionListString.add(text);		
//			}
//		}
//		System.out.println(suggestionListString);
//		
		//For Clicking on a specific suggestion
//		for(WebElement e:suggestionList)
//		{
//			String text=e.getText();
//			if(text.contains("rich foods"))
//			{
//				e.click();
//				break;
//			}
//		}
//	}
}
	public static WebElement getElement(By locator)
	{
			return driver.findElement(locator);
	}
	
	public static void dosSendKeys(By locator,String value)
	{
				getElement(locator).sendKeys(value);
	}
	
	public static List<WebElement> getElements(By locator)
	{
			return driver.findElements(locator);
	}
	
	public static void printSuggestionListFromSearchBar(By locator1,By locator2,String value) throws InterruptedException
	{	
		getElement(locator1);
		
		getElement(locator1).sendKeys(value);
		
		Thread.sleep(5000);
		
		List<WebElement> suggestionsList=getElements(locator2);
		
		List<String> suggestionsListString=new ArrayList<String>();
		
		for(WebElement e:suggestionsList)
		{
			String text=e.getText();
			if(text.length()>0)
			{
				suggestionsListString.add(text);		
			}
		}
		System.out.println(suggestionsListString);
	}
	
	public static void clickOnSuggestionFromSuggestionListInSearchBar(By locator1,By locator2,String value,String clickSuggestion) throws InterruptedException
	{	
		getElement(locator1);
		
		getElement(locator1).sendKeys(value);
		
		Thread.sleep(5000);
		
		List<WebElement> suggestionsList=getElements(locator2);
		
		for(WebElement e:suggestionsList)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.contains(clickSuggestion))
			{
				e.click();
				break;
			}
		
		}
	}
}	

