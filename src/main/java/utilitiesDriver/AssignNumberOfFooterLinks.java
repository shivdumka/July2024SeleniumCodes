package utilitiesDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignNumberOfFooterLinks {
	
	static WebDriver driver;
	public static void main(String[] args) 
	{
		//total no of footer links
		//print the text of these footers
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> footerLinks=driver.findElements(By.xpath("//div[@class='col-sm-3']//ul[@class='list-unstyled']//a"));
		int countFooterLinks=footerLinks.size();
		System.out.println(countFooterLinks);
		
		for(WebElement e:footerLinks)
		{
			String text=e.getText();
			System.out.println(text);
		}

	}

}
