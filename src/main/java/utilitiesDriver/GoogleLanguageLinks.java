package utilitiesDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> langLinks= driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		List<String> langLinksString=new ArrayList<String>();
		int langLinkSize=langLinks.size();
		System.out.println("Total number of language links are:"+langLinkSize);
		for(WebElement e:langLinks)
		{
			String text=e.getText();
			langLinksString.add(text);
			if(text.contains("मराठी"))
			{
				e.click();
				break; 
			}
		}
		System.out.println(langLinksString);
	}

}
