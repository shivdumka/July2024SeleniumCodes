package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@id='imageTemplateContainer']/img")).click();
		
		
		Thread.sleep(2000);
		
		int countIframe=driver.findElements(By.tagName("iframe")).size();
		System.out.println(countIframe);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Shivam");
		
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Delhi");
		
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("12/12/2022");
		
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("I am here to generally fill the form to test my automation skills");
		
		driver.findElement(By.id("RESULT_FileUpload-6")).sendKeys("C:\\java masterclass\\IDM 6.42 build 17 incl Patch [CrackingPatching]\\Password.txt");
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Shivam");
		
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Automation");
		
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Javaelenium road");
		
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Automator District");
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-13']")));
		
		select.selectByVisibleText("Florida");
		
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("264567");
		
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("9999999999");
		
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("shivamautomation@gmail.com");
		
		driver.findElement(By.id("FSsubmit")).click();
		
		driver.switchTo().defaultContent();
		
		String docVerf=driver.findElement(By.cssSelector("div.details__preview-wrapper>h3")).getText();
		
		System.out.println(docVerf);
		
		
		

	}

}
