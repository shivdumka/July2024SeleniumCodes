package utilitiesDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
static WebDriver driver;
	public static void main(String[] args)
	
	{
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
	//	By clickRadioButton=By.xpath("//a[text()='Joe.Root']/preceding::td/input[@id='ohrmList_chkSelectRecord_21']");
		//By clickRadioButton=By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']");
		
		
		//driver.findElement(selectCheckbox("Jasmine.Morgan")).click();
		selectUserCheckbox("Jasmine.Morgan");
		
//		List<WebElement> rowJoe=driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//		for(WebElement e:rowJoe)
//		{
//			String text=e.getText();
//			System.out.println(text);
//		}
		
		List<String> user1=printUserDetails("Jasmine.Morgan");
		System.out.println(user1);
		List<String> user2=printUserDetails("Joe.Root");
		System.out.println(user2);
	}
	
	public static void selectUserCheckbox(String name)
	{
		driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> printUserDetails(String name)
	{
		List<WebElement> userDetails=driver.findElements(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td"));
		List<String> userInfo=new ArrayList<String>();
		for(WebElement e:userDetails)
		{
			String text=e.getText();
			userInfo.add(text);
		}
		return userInfo;
	}

}
