package utilitiesDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtilities {
	WebDriver driver;

	/**
	 * This initdriver method ia a generic/utility method that uses the driver=new
	 * chromedriver to open the browser but difference is its reusable. Similarly
	 * another methods are also generic which helps us with reusing them wherever
	 * required and they are made on top of selenium existing methods
	 */

	public WebDriver initDriver(String browser) 
	{
		System.out.println("You opened " + browser + " browser");
		switch (browser.toLowerCase().trim())
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Incorrect browser passed: " + browser);
			throw new BrowserException("===Invalid Browser===");
		}
		return driver;
	}

	public void enterURL(String url) 
	{
		if (url.indexOf("http") != 0 || url.length() == 0) {
			throw new BrowserException("===Invalid URL===");
	}
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}
}
