package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadOSPopUP {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement fileUpload=driver.findElement(By.name("upfile"));
		fileUpload.sendKeys("C:\\java masterclass\\IDM 6.42 build 17 incl Patch [CrackingPatching]\\Password.txt");

	}

}
