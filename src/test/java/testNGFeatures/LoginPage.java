package testNGFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage 
{
 	
 	WebDriver driver;
 	
 	
 	//INITIALZING DRIVER FROM LOGINPAGETEST
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private By username=By.id("input-email");
	private By password=By.id("input-password");
	private By forgotPwd=By.linkText("Forgotten Password");
	private By loginBtn=By.xpath("//input[@type='submit']");
//	private By logout=By.linkText("Logout");
//	private By loginAgain=By.linkText("Login");
	
	
	public String getLoginPageTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getURL()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
		
	}
	
	public boolean forgotPasswordLink()
	{
		return driver.findElement(forgotPwd).isDisplayed();
	}
	
	public boolean logoIsPresent()
	{
		return driver.findElement(By.xpath("//a/img[@title='naveenopencart']")).isDisplayed();
	}

	public String login(String usrname,String pwd)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(username).sendKeys(usrname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		String title=driver.getTitle();
		System.out.println("Account Successfully craeted and this page title is: "+title);
		return title;
	}
	

	
	
}


