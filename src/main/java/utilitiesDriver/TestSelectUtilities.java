package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelectUtilities {
	//static WebDriver driver;
	public static void main(String[] args)  
	{
		//WebDriver driver = SelectClassForDropdown.driver;
		//WebDriver driver=new ChromeDriver();
		//ElementUtility ele=new ElementUtility(driver);
		//SelectClassForDropdown ele=new  SelectClassForDropdown();
		//driver=new ChromeDriver();
		//driver.get("https://orangehrm.com/en/30-day-free-trial");
		SelectClassForDropdown.getDriver();
		By countryList=By.xpath("//select[@id='Form_getForm_Country']/option[@value]");
	//	ele.getDropdownOptionsWithoutSelectClass(countryList,"India");
		SelectClassForDropdown.printDropdownOptions(countryList);
	//	SelectClassForDropdown.selectByVisibleTextDropdown(countryList,"India");
		
	//	ele.selectByValueDropdown(countryList,"India");
	}

}
