import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics 
{
	static WebDriver driver;  
	public static void main(String[] args)
	{
		//WebDriver driver=null; 
		String browser="opera";
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
		default:
			System.out.println("Incorrect browser passed: "+browser);
			throw new RuntimeException("Wrong Browser.."+browser+" Pass correct browser ");
		}
		//ChromeDriver driver=new ChromeDriver();    //4.23.0
		//EdgeDriver driver=new EdgeDriver();\
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("google")) 
		{
			System.out.println("Correct Title....Pass");
		}
		else 
		{
			System.out.println("Incorrect Title....Fail");
		}
		
		driver.quit();
		}

}
