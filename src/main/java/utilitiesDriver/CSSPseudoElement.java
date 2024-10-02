package utilitiesDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSPseudoElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Thread.sleep(5000);
		
		String asteriskEle="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),\"::before\").getPropertyValue(\"content\");";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String asteriskPseudo=js.executeScript(asteriskEle).toString();
	//	String asteriskPseudo=(String)js.executeScript(asteriskEle);
		System.out.println(asteriskPseudo);
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
