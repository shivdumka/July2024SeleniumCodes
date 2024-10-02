package selfpracticeUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args)
	{

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		int linksListCount=linksList.size();
		System.out.println(linksListCount);

		//Iterating through every link
		int blankCount=0;
		int fullText=0;
		for(int i=0;i<=linksListCount-1;i++)
		{
			String str=linksList.get(i).getText();
//			if(str.length()>0)
//			{
//			System.out.println(i+" "+str);
//			}
			
			if(str.length()==0)
			{
				blankCount=blankCount+1;
				
			}
			else if(str.length()>0)
			{
				fullText=fullText+1;
				
			}
			
		}
		System.out.println("Total no. of Blank Texts in WebPage-->"+blankCount);
		System.out.println("Total no. of Full Texts in WebPage-->"+fullText);
		
		
		System.out.println("---------------========================================-------------------------");
		int count=1;
		for(WebElement e:linksList)
		{

			String str=e.getText();
			if(str.length()>0)
			{
				System.out.println(count+" "+str);
			}
			count++;
			
		}
		

	}
}





//static WebDriver driver;
//public static void main(String[] args) throws InterruptedException 
//{
//	driver=new ChromeDriver();
//	driver.get("https://www.google.com");
//	driver.findElement(By.name("q")).sendKeys("Selenium");
//	Thread.sleep(3000);
//	List<WebElement> suggestions=driver.findElements(By.xpath("//ul/li//div[@class='wM6W7d']/span"));
//	System.out.println(suggestions.size());
//	for(WebElement e:suggestions)
//	{
//		String text=e.getText();
//		System.out.println(text);
//		if(text.contains("rich foods"))
//		{
//			e.click();
//			break;		//if this break is not applied then after clicking e will try to iterate over other rest suggestions but
//						//now as we have clicked on one of the suggestions already and DOM is refreshed with new elements
//						//,therefore we'll get StaleELementReferenceExcpetion 
//		}
//	}
//	
//}
