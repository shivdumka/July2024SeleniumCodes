package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-and-nested-iframe/");
		
		Thread.sleep(2000);

	//	driver.switchTo().frame("pact2")
//				.switchTo().frame("pact3")
//								.findElement(By.id("glaf"))	
//									.sendKeys("Very Good Salary");
		
		
//		int countIframe=driver.findElements(By.tagName("iframe")).size();
//		System.out.println(countIframe);
		
		
		driver.findElement(By.id("inp_val")).sendKeys("Shivam");
		
		driver.switchTo().frame(driver.findElement(By.id("pact2")));
		
		driver.findElement(By.id("jex")).sendKeys("Automator");

		int countIframe=driver.findElements(By.tagName("iframe")).size();
		System.out.println(countIframe);
		
		driver.switchTo().frame("pact3");
		
		driver.findElement(By.id("glaf")).sendKeys("ISTQB");
		
	
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("inp_val")).sendKeys(" Automation");

//		driver.switchTo().parentFrame();
//		
//		driver.findElement(By.id("jex")).sendKeys(" Tester");
//		
//		driver.switchTo().parentFrame();
//		
//		driver.findElement(By.id("inp_val")).sendKeys(" Automation");
		
	}

}
