package utilitiesDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorConcept {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException 
		{
				driver=new ChromeDriver();
				driver.get("https://www.aqi.in/dashboard/canada");
				Thread.sleep(10000);
				WebElement referenceEle=driver.findElement(By.xpath("(//a[text()='Wood Buffalo, Canada'])[position()=1]"));
				String rank=driver.findElement(with(By.tagName("p")).toLeftOf(referenceEle)).getText();
				System.out.println(rank);
				String aqiOfCity=driver.findElement(with(By.tagName("p")).toRightOf(referenceEle)).getText();
				System.out.println(aqiOfCity);
				String cityBelow=driver.findElement(with(By.tagName("a")).below(referenceEle)).getText();
				System.out.println(cityBelow);
				String aboveCity=driver.findElement(with(By.tagName("a")).above(referenceEle)).getText();
				System.out.println(aboveCity);
				String nearElement=driver.findElement(with(By.tagName("a")).near(referenceEle,25)).getText();
				System.out.println(nearElement);
		}

}
