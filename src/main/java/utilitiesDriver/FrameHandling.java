package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		int countFrame=driver.findElements(By.tagName("frame")).size();
		
		System.out.println(countFrame);
	//	driver.switchTo().frame(2);
	//	driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		WebElement header=driver.findElement(By.xpath("//h2[contains(text(),'Title bar')]"));
		System.out.println(header.getText());
		
	}

}
