package testNGFeatures;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
	
	//driver will be inherited here automatically
	
	LoginPage lp;
	
	
	@Test
	public void LoginPageTitleTest()
	{	
		lp=new LoginPage(driver);
		String actualTitle=lp.getLoginPageTitle();
		Assert.assertEquals(actualTitle,"Account Login");
	}
	@Test
	public void LoginPageURLTest()
	{
		lp=new LoginPage(driver);
		String actualURL=lp.getURL();
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}
	
	@Test
	public void loginPageforgotPwdLinkDisplayTest()
	{	
		lp=new LoginPage(driver);
		boolean forgotPwdLink=lp.forgotPasswordLink();
		Assert.assertTrue(forgotPwdLink);
	}
	
	@Test
	public void loginPageLogoDisplayTest()
	{
		lp=new LoginPage(driver);
		boolean logoPresent=lp.logoIsPresent();
		Assert.assertTrue(logoPresent);
	}
	
	@DataProvider(name="getCredentials")
	public Object[][] loginCredentialsdataset()
	{
			return new Object[][] 
					{
						{"shivam1234@hotmail.com","12345678"},
						{"deepak1234@gmail.com","123123123"}
					};
			
	}
				
	@Test(dataProvider ="getCredentials")
	public void loginTest(String usname,String pswrd)
	{
		lp=new LoginPage(driver);
		lp.login(usname, pswrd);
		String accountTitle=driver.getTitle();
		Assert.assertEquals(accountTitle,"My Account");
	}
	
}
