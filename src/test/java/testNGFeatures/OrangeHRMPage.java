package testNGFeatures;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class OrangeHRMPage 
{
	
	WebDriver driver;
 	
 	
 	//INITIALZING DRIVER FROM LOGINPAGETEST
	public OrangeHRMPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	public String getOrangeHomePageTitle()
	{
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getOrangeURL()
	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
		
	}

}
