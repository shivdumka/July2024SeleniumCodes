package selfpracticeUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class RoughClass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		RoughClass red=new RoughClass();
		//launchBrowser("chrome");
		red.launchBrowser("Chrome");
		launchURL("https://sauce-demo.myshopify.com/");
		printTitle();
		printCurrentURL();
//		Thread.sleep(10000);
//		quitBrowser();
		
		By signup=By.linkText("Sign up");
//		driver.findElement(signup).click();
		doClick(signup);
		
	//	Thread.sleep(10000);
		
		By header=By.className("accounts-title");
//		String printHeader=findWebElement(header).getText();
//		System.out.println(printHeader);
		printText(header);
		
		
//		By fName=By.id("first_name");
		By fName=By.name("customer[first_name]");
		By lname=By.name("customer[last_name]");
		By email_id=By.name("customer[email]");
		By pwd=By.name("customer[password]");
		By createAccount=By.xpath("//*[@id=\"create_customer\"]/div[6]/input");
		//By notARobot=By.xpath("//*[@id=\"recaptcha-anchor\"]");
		By done=By.className("shopify-challenge__message");
//		findWebElement(fName).sendKeys("Shivam");
		doSendKeys(fName,"Shivam");
		doSendKeys(lname,"Dumka");
		doSendKeys(email_id,"shivam@gmail.com");
		doSendKeys(pwd,"shivam@123");
		doClick(createAccount);
		Thread.sleep(10000);
	//	doClick(notARobot);
		printText(done);
		
	}
	
	public WebDriver launchBrowser(String browser)
	{
		
		switch(browser.toLowerCase().trim())
		{
		case "chrome":
			driver=new ChromeDriver();
		break;
		
		case "firefox":
			driver=new FirefoxDriver();
		break;
		
		case "edge":
			driver=new EdgeDriver();
		break;
		
		case "safari": 
			driver=new SafariDriver();
		break;
		
		default:
			throw new BrowserExceptions("===Wrong Browser===");
		
		}
		return driver;
	}
	
	public static void launchURL(String url)
	{
		driver.get(url);
	}
	
	public static void printTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public static void printCurrentURL()
	{
		String cururl=driver.getCurrentUrl();
		System.out.println(cururl);
	}

	public static void quitBrowser()
	{
		driver.quit();
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
	
	public static WebElement findWebElement(By locator)
	{
		return driver.findElement(locator);
	}

	
	
	public static void doClick(By locator)
	{
		findWebElement(locator).click();
	}
	
	
    public static void printText(By locator)
	{
    	String text= findWebElement(locator).getText();
    	System.out.println(text);
//		String text=findWebElement(locator).getText();
		
//		if(text!=null)
//		{
//			return text;
//		}
//		else
//		{
//			System.out.println("Element is null"+text);
//			return null;
//		}
	}
	
	public static void doSendKeys(By locator,String value)
	{
		findWebElement(locator).sendKeys(value);
	}
	

}

