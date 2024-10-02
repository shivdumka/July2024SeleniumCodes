package utilitiesDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignPrintAllCountryOptionsUsingCSS {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		List<WebElement> allCountry=driver.findElements(By.cssSelector("select option"));
		List<String> optionsCountry=new ArrayList<String>();
		for(WebElement e:allCountry)
		{
			String text=e.getText();
			optionsCountry.add(text);
		}
		System.out.println(optionsCountry);
	}

}
