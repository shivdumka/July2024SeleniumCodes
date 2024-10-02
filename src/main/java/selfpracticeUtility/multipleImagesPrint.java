package selfpracticeUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleImagesPrint {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		
		//print links of all the images
//		List<WebElement> imagesList=driver.findElements(By.tagName("img"));
//		int totalImages=imagesList.size();
//		System.out.println("total number of Images on the page-->"+totalImages);
//		for(int i=0;i<=totalImages-1;i++)
//		{
//			String linksOfImages=imagesList.get(i).getAttribute("src");
//			System.out.println(i+" "+linksOfImages);
//		}
		
		//Capture all the links on flipkart+print their href value with their text
		
//		List<WebElement> linkAttribute=driver.findElements(By.tagName("a"));
//		int totalLinks=linkAttribute.size();
//		System.out.println(totalLinks);
//		int count=1;
//		for(WebElement e:linkAttribute)
//		{
//			String attrbValue=e.getAttribute("href");
//			String text=e.getText();
//			System.out.println(count+" "+text+"-------------------> "+attrbValue);
//			count++;
//		}
		
		
		//Capture number of tecxtfield in opencart website/register page
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> textField=driver.findElements(By.className("form-control"));
		int countTextField=textField.size();
		System.out.println("Total Number of TextFields-->"+countTextField);
		int count=1;
		for(WebElement e:textField)
		{
			String placeHolder=e.getAttribute("placeholder");
			System.out.println(count+" "+placeHolder);
			count++;
		}
	}

}
