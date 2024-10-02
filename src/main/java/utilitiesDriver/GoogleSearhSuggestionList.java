package utilitiesDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearhSuggestionList {

	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException
	{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			WebElement searchBar=driver.findElement(By.id("APjFqb"));
			searchBar.sendKeys("selenium");
			Thread.sleep(5000);
			List<WebElement> suggestionList=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
			
			//for printing suggestion list in the form of List of Strings
			List<String> suggestionListString=new ArrayList<String>();
			for(WebElement e:suggestionList)
			{
				String text=e.getText();
				if(text.length()>0)
				{
					
						suggestionListString.add(text);
						
						
						
				}
			}
			System.out.println(suggestionListString);
			
			//For Clicking on a specific suggestion
			for(WebElement e:suggestionList)
			{
				String text=e.getText();
				if(text.contains("rich foods"))
				{
					e.click();
					break;
				}
				}
	}

}
