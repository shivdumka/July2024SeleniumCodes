package utilitiesDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class svgSpecialXpathAmericaMap {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		
		By americanStates=By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']");
		List<WebElement> americanStatesName=driver.findElements(americanStates);
		System.out.println(americanStatesName.size());
		
		Actions act=new Actions(driver);
		for(WebElement e:americanStatesName)
		{
			String text=e.getAttribute("id");
			System.out.println(text);
			if(text.contains("wyoming"))
			{
				e.click();
				break;
			}
			act.moveToElement(e).perform();
		}
		
		
		
//		Actions act=new Actions(driver);
//		act(driver.findElement(americanStates));
	}

}
