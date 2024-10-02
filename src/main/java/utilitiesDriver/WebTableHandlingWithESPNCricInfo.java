package utilitiesDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandlingWithESPNCricInfo {

	static WebDriver driver;
	public static void main(String[] args)
	
	{
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
//		WebElement wicketTaker=driver.findElement(By.xpath("//a[@title='Dawid Malan']/ancestor::td/following-sibling::td//span[contains(text(),'Walter')]"));
//		String text=wicketTaker.getText();
//		System.out.println(text);
		System.out.println(batterWicketTaker("Sam Curran"));
		System.out.println(batterDetails("Dawid Malan"));
	}

	
	public static String batterWicketTaker(String batter)
	{
		WebElement wicketTaker=driver.findElement(By.xpath("//span[text()='"+batter+"']/ancestor::td/following-sibling::td//span"));
		return wicketTaker.getText();
		
	}
	
	public static List<String> batterDetails(String batter)
	{
		List<WebElement> batterAllDetails=driver.findElements(By.xpath("//span[text()='"+batter+"']/ancestor::td/following-sibling::td"));
		List<String> detailsOfBatter=new ArrayList<String>();
		for(WebElement e:batterAllDetails)
		{
			String text=e.getText();
			detailsOfBatter.add(text);
		}
		return detailsOfBatter;
	}
}
