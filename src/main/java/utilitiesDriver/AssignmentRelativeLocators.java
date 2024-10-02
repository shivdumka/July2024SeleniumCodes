package utilitiesDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentRelativeLocators {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//			WebElement emailInputBox=driver.findElement(By.xpath("//input[@id='input-email']"));
//			driver.findElement(with(By.tagName("input")).below(emailInputBox)).sendKeys("Password@123");
	//		String text=driver.findElement(with(By.tagName("p")).toLeftOf(referenceEle)).getText();)
			WebElement checkBoxAsReferenceEle= driver.findElement(By.xpath("//input[@name='agree']"));
			String text=driver.findElement(with(By.tagName("b")).toLeftOf(checkBoxAsReferenceEle)).getText();
			
			
			System.out.println(text);
			if(text.equals("Privacy Policy"))
			{
				System.out.println("Pass");
			}
			else 
			{
				System.out.println("Fail");
			}
			
			String continueButtonPresentOrNot=driver.findElement(with(By.tagName("input")).toRightOf(checkBoxAsReferenceEle)).getAttribute("value");
			System.out.println(continueButtonPresentOrNot);
			if(continueButtonPresentOrNot.equals("Continue"))
			{
				System.out.println("Pass");
			}
			else 
			{
				System.out.println("Fail");
			}
			
			//Filling the form
			//But after firstname and lastname the form is not getting filled even though the locators were correct as same as fname and lname.....
			//......but still couldn't work,line no 58 61 64 67 By.tagname("input") didnt worked but i changed the locators and it worked fine.....
			//....STRANGE BEHAVIOUR
			
			WebElement firstName=driver.findElement(By.xpath("//label[@for='input-firstname']"));
			driver.findElement(with(By.tagName("input")).toRightOf(firstName)).sendKeys("John");
			
			WebElement lastName=driver.findElement(By.xpath("//label[@for='input-lastname']"));
			driver.findElement(with(By.tagName("input")).toRightOf(lastName)).sendKeys("Doe");
			
			WebElement eMail=driver.findElement(By.xpath("//label[text()='E-Mail']"));
			driver.findElement(with(By.xpath("//input[@id='input-email']")).toRightOf(eMail)).sendKeys("JohnDoe@hotmail.com");
			
			WebElement telephone=driver.findElement(By.xpath("//label[@for='input-telephone']"));
			driver.findElement(with(By.xpath("//input[@name='telephone']")).toRightOf(telephone)).sendKeys("9898989879");
			
			WebElement password=driver.findElement(By.xpath("//label[@for='input-password']"));
			driver.findElement(with(By.xpath("//input[@id='input-password']")).toRightOf(password)).sendKeys("password@123");
			
			WebElement passwordConfirm=driver.findElement(By.xpath("//label[@for='input-confirm']"));
			driver.findElement(with(By.xpath("//input[@id='input-confirm']")).toRightOf(passwordConfirm)).sendKeys("password@123");
			
	}

}
