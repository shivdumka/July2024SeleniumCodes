package utilitiesDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightContextClick {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickOnMe=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rightClickOnMe).perform();
		
		//WebElement clickOnPaste=driver.findElement(By.xpath("//span[text()='Paste']"));
	//	act.click(clickOnPaste).perform();
		
	//	Thread.sleep(5000);
		
		//WebElement printEdit=driver.findElement(By.xpath("//span[text()='Edit']"));
		//System.out.println(printEdit.getText());
		
		List<WebElement> printOptions=driver.findElements(By.cssSelector("ul.context-menu-list span"));
		int count=printOptions.size();
		System.out.println(count);
		if(printOptions.size()==6)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		for(WebElement e:printOptions)
		{
			String text=e.getText();
			System.out.println(text);	
			if(text.equalsIgnoreCase("Quit"))
			{
				e.click();
				break;
			}
		}
		
		
		
	}

}
