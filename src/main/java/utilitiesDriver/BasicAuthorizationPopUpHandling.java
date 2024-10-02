package utilitiesDriver;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAuthorizationPopUpHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		String username="admin";
		String password="admin";
		driver=new FirefoxDriver();
		//driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		
		//driver.switchTo().win
		UsernameAndPassword cred=new UsernameAndPassword(username,password);
		
		((HasAuthentication)driver).register(()-> cred);
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}

}
