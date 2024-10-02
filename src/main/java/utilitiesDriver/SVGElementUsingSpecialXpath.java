package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementUsingSpecialXpath {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("MacBook M1 Pro");
		By svgSearchIconElement=By.xpath("//div[@class='_1sFryS _2alaMB']//*[local-name()='svg' and @fill='none']");
		driver.findElement(svgSearchIconElement).click();
	}

}
