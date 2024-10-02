package utilitiesDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String Register=driver.findElement(By.tagName("h2")).getText();
		System.out.println(Register);

	}

}
