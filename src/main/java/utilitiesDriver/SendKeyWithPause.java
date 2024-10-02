package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyWithPause {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException 
		{
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			WebElement firstName=driver.findElement(By.id("input-firstname"));
			
			String str="Shivam";
			//char ch[]=new char[str.length()];
			char ch[]=str.toCharArray();
			Actions act=new Actions(driver);
			for(int i=0;i<=str.length()-1;i++)
			{
				ch[i]=str.charAt(i);
				
			}
			for(int j=0;j<=ch.length-1;j++)
			{
				char c=ch[j];
				String send=String.valueOf(c);
				act.sendKeys(firstName,send).pause(300).perform();
			}
	}

}
