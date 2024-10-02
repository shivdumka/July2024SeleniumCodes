package utilitiesDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;

public class QuitVSClose {

	public static void main(String[] args) {
				WebDriver driver=new ChromeDriver(); 
				//SessionId session = driver.();
				driver.get("https://www.google.com");
				String title=driver.getTitle();
				System.out.println(title);
//				driver.quit();
	driver.close();						
				driver.getTitle();     //driver.quit()--> NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
										//driver.close()--> NoSuchSessionException: invalid session id
	}

}
