package utilitiesDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in");
		String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(2000);
		
		driver.navigate().back();
		String title3=driver.getTitle();
		System.out.println(title3);
		Thread.sleep(2000);
		
		driver.navigate().forward();
		String title4=driver.getTitle();
		System.out.println(title4);
		Thread.sleep(2000);
		
		driver.navigate().forward();
		String title5=driver.getTitle();
		System.out.println(title5);
		
		driver.navigate().back();
		String title6=driver.getTitle();
		System.out.println(title6);
		//driver.navigate().to(new URL("https://wwww.amazon.com"));		
		
		driver.manage().window().maximize();
	
	
	}

}
