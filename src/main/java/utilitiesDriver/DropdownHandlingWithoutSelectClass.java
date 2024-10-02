package utilitiesDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandlingWithoutSelectClass {

	static  WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		//List<WebElement> countryList=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		
		By countryList=By.xpath("//select[@id='Form_getForm_Country']/option");
		List<String> listPrint=getDropdownOptionsWithoutSelectClass(countryList,"India");
		System.out.println(listPrint);
		//System.out.println(printCountryList);
		//int countCountryList=countryList.size();
		//System.out.println(countCountryList);
		
//		for(WebElement e:countryList)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.contains("India"))
//			{
//				e.click();
//				break;
//			}
//		}
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}

	public static List<String> getDropdownOptionsWithoutSelectClass(By locator,String value)
	{
		List<WebElement> getOptionsDropdown=getElements(locator);
		System.out.println(getOptionsDropdown.size());
		List<String> getOptionsList=new ArrayList<String>();
		for(WebElement e:getOptionsDropdown)
		{
			String text=e.getText();
			getOptionsList.add(text);
			if(text.contains(value))
			{
				e.click();
				break;
			}
			
		}
		return getOptionsList;
	}
}
