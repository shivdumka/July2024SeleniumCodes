package utilitiesDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ROughDeleteit {
	
	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		List<WebElement> bowlerDetails=driver.findElements(By.xpath("//span[text()='Spencer Johnson']/ancestor::td[@class='ds-flex ds-items-center']/following-sibling::td"));
		List<String> ballerInfo=new ArrayList<String>();
		for(WebElement e:bowlerDetails)
		{
			String text=e.getText();
			ballerInfo.add(text);
		}
		System.out.println(ballerInfo);

	}

}
