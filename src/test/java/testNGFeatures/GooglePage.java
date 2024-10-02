package testNGFeatures;

import org.openqa.selenium.WebDriver;

public class GooglePage 
{
	WebDriver driver;
 	
 	
 	//INITIALZING DRIVER FROM LOGINPAGETEST
	public GooglePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getGoogleHomePageTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getGoogleURL()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
		
	}

}
