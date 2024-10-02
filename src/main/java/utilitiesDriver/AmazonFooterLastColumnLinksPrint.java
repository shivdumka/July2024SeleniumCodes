package utilitiesDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooterLastColumnLinksPrint {

		static  WebDriver driver;
		public static void main(String[] args) 
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.com");
			By footerLastCol=By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[last()]//a");
			List<WebElement> footerLastColList=driver.findElements(footerLastCol);
			int totalLastColElements=footerLastColList.size();
			System.out.println(totalLastColElements);
			for(WebElement e:footerLastColList)
			{
				String text=e.getText();
				System.out.println(text);
			}
		}

}


//form[@id='hs-login']//input[@id='username']

