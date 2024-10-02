package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignPrintLabelsOfAllInputField {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		printLabel("First Name");
		
		
	}
	public static void printLabel(String input)
	{
		WebElement label=driver.findElement(By.xpath("//input[@placeholder='"+input+"']/preceding::label[@for]")) ;
		String printLabel=label.getText();
		System.out.println(printLabel);
	}

}
