package utilitiesDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignAmazonFooterUtil {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		amazonFooterColumnWiseLink("Make Money with Us");
		
	}
	public static void amazonFooterColumnWiseLink(String footerName)
	{
		List<WebElement> footerAmazon=driver.findElements(By.xpath("//div[text()='"+footerName+"']/following-sibling::ul/li"));
		int countFooterElements=footerAmazon.size();
		System.out.println(countFooterElements);
		for(WebElement e:footerAmazon)
		{
			String text=e.getText();
			System.out.println(text);
		}
	}

}
