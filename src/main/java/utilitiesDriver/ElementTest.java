package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementTest {

	public static void main(String[] args) 
	{
		BrowserUtilities brow=new BrowserUtilities();
		WebDriver driver=brow.initDriver("chrome");
		brow.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brow.getTitle();
		brow.getPageURL();
		ElementUtil el=new ElementUtil(driver);
		By email_id=By.id("input-email");
		By pwd=By.id("input-password");
		el.dosendKeys(email_id, "shivam@gmail.com");
		el.dosendKeys(pwd,"Shivam@123");
		
	}

}
