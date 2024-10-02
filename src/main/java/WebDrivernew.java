import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDrivernew {
	static WebDriver driver;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rookie\\Documents\\MyDriver\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);

	}

}
