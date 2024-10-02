package myTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures
{
	@BeforeSuite
	public void connectWithDB()
	{
		System.out.println("BS-ConnectWithDB");
	}
	
	@BeforeTest
	public void createUser()
	{
		System.out.println("BT-createUser");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("BC-openBrowser");
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("BM-LogIn to App");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	
	@Test
	public void cartTest()
	{
		System.out.println("cart Test");
	}
	
	@Test
	public void paymentTest()
	{
		System.out.println("Payment Test");
	}
	
	@AfterMethod
	public void logOutFromApp()
	{
		System.out.println("AM-Log Out");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AC-openBrowser");
	}
	
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AT-createUser");
	}
	
	@AfterSuite
	public void disconnectWithDB()
	{
		System.out.println("AS-disConnectWithDB");
	}
	
}
