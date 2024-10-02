package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutorConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		String url=js.executeScript("return document.URL;").toString();
//		System.out.println(url);
		
		JavaScriptUtil jsu=new JavaScriptUtil(driver);
		
		Thread.sleep(5000);
//		System.out.println(jsu.getTitle());
//		System.out.println(jsu.getURL());
//		//jsu.generateAlertPopUP("Hello Automation Engineer");
//		String wholeText=jsu.getWholeWebPageText();
//		if(wholeText.contains("Grocery") && wholeText.contains("Appliances"))
//		{
//			System.out.println("TC Pass");
//		}
//		driver.navigate().to("https://www.google.com");
//		jsu.goBackwithJS();
//		
//		Thread.sleep(500);
//		
//		jsu.zoomWithJS(90);
//		
//		Thread.sleep(2000);
//		
//		jsu.zoomWithJS(150);
//		
//		Thread.sleep(2000);
//		
//		jsu.zoomWithJS(600);
//		
//		Thread.sleep(2000);
//		
//		jsu.zoomWithJS(100);
//		WebElement element=driver.findElement(By.xpath("//span[normalize-space()='Back to top']"));
		
	//	WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Everything For')]"));
	//	jsu.scrollDownToPageCustom(2000);
		
		//jsu.scrollToElement(element);
		
	//	js.executeScript("arguments[0].scrollIntoView(true)", element);
	//	Thread.sleep(2000);
//		element.click();
//		Actions act=new Actions(driver);
//		act.click(element).perform();
//		js.executeScript("arguments[0].style.border='3px solid red'",ele);
		
		
		

//	public static String getTitle()
//	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		return js.executeScript("return document.title;").toString();
//	}
//	public static String getURL()
//	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		return js.executeScript("return document.URL;").toString();
//	}
	
	WebElement elementForm=driver.findElement(By.id("hs-login"));
	
	//js.executeScript("arguments[0].style.border='3px solid red'", elementForm);
	
	//Thread.sleep(2000);
	
	WebElement uid=driver.findElement(By.id("username"));
	
	//js.executeScript("arguments[0].style.border='3px solid red'", uid);
	
	jsu.drawBorderAroundElement(elementForm);
	
	jsu.drawBorderAroundElement(uid);
	
// example--->	js.executeScript("arguments[0].scrollInView(true)", element)
	}
}
