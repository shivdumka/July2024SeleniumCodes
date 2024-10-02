package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUsingActionClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		By dragThisElement=By.xpath("//div[@id='draggable']");
		By dropHereTheElement=By.xpath("//div[@id='droppable']");
		
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(dragThisElement))
							   .moveToElement(driver.findElement(dropHereTheElement))
							   .release()
							   .build()
							   .perform();
				
		
		
	//	act.dragAndDrop(driver.findElement(dragThisElement), driver.findElement(dropHereTheElement)).build().perform();
	}

}
