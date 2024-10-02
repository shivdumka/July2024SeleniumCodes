package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		//BrowserUtilities brow=new BrowserUtilities();
		//WebDriver driver=brow.initDriver("chrome");
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	
		
		By login=By.linkText("Login");
		By Register=By.linkText("Register");
		By radbut=By.name("agree");
		
		doClick(login);
		Thread.sleep(3000);
		doClick(Register);
		Thread.sleep(3000);
		doClick(radbut);
	}

	public static WebElement getElement(By locator)
	{
		
		return driver.findElement(locator);
	}
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
}
