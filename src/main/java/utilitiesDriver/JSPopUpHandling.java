package utilitiesDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUpHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.Alerts pop up
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
		//alert.accept();
		//alert.dismiss();
		
		// 2.Confirmation pop up
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		// alert.dismiss();	
		

		// 3.Prompt pop up
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.sendKeys("ShivamAutomation");
		//alert.accept();
		 alert.dismiss();	
		

	}

}
