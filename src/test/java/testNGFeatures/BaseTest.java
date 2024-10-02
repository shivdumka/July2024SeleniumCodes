package testNGFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	WebDriver driver;
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void setUp( String url,String browser)    //@Optional("https://www.google.com")   @Optional("chrome") 
	
	{
		switch(browser.trim().toLowerCase())
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
		default:
			System.out.println("Passed incorrect browser:"+browser);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}



}
