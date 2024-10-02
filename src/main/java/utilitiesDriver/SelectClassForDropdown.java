package utilitiesDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassForDropdown {
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		By countryList=By.xpath("//select[@id='Form_getForm_Country']/option[@value]");
	//	By selectCountry=By.id("Form_getForm_Country");
	//	selectByValueDropdown(selectCountry,"India");
	//	selectByIndexDropdown(selectCountry,1);
	//	selectByVisibleTextDropdown(selectCountry,"India");
		//System.out.println(getDropdownOptionsCount(selectCountry));
	//	List<String> printCountryList=printDropdownOptions(selectCountry);
		//System.out.println(printCountryList);
		
		List<String> expectedCountry=Arrays.asList("India","Australia","ui");
		List<String> list=printDropdownOptions(countryList);
		System.out.println(list);
		if(printDropdownOptions(countryList).containsAll(expectedCountry))
		{
			System.out.println("Test case is passed");
		}
		else 
		{
			System.out.println("Test case is failed");
		}
	}
	
	public static void getDriver()
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void selectByValueDropdown(By locator,String value)
	{
		WebElement webElement=getElement(locator);
		Select select=new Select(webElement);
		select.selectByValue(value);	
	}
	
	public static void selectByIndexDropdown(By locator,int index)
	{
		WebElement webElement=getElement(locator);
		Select select=new Select(webElement);
		select.selectByIndex(index);	
	}
	
	public static void selectByVisibleTextDropdown(By locator,String value)
	{
		WebElement webElement=getElement(locator);
		
		Select select=new Select(webElement);
		select.selectByVisibleText(value);	
	}
	
	public static int getDropdownOptionsCount(By locator)
	{
		WebElement webElement=getElement(locator);
		Select select=new Select(webElement);
		List<WebElement> countOptionsInDropdown=select.getOptions();
		return countOptionsInDropdown.size();
	}
	
	public static List<String> printDropdownOptions(By locator)
	{
		WebElement webElement=getElement(locator);
		Select select=new Select(webElement);
		List<WebElement> printOptionsInDropdown=select.getOptions();
		List<String> printOptionsOfDropdown=new ArrayList<String>();
		for(WebElement e:printOptionsInDropdown)
		{
			String text=e.getText();
			printOptionsOfDropdown.add(text);
		}
		return printOptionsOfDropdown;
	}
	
	
	//never use below switch case to accomodate all the abovw three generic utilities in one
//	public static void selectDropDownByChoice(By locator,String selectType,String valueForValueAttribute,String valueOfVisibleText,int index)
//	{
//		WebElement webElement=getElement(locator);
//		Select select=new Select(webElement);
//		switch(selectType.toLowerCase())
//		{
//		case "visibleText":
//			select.selectByValue(valueForValueAttribute);	
//			break;
//		case "byindex":
//			select.selectByIndex(index);
//			break;
//		case "AttributeValue":
//			select.selectByVisibleText(valueOfVisibleText);	
//			break;
//		default:
//			System.out.println("Pass the correct select option");
//			break;
//			
//		}
//	}
	
}
