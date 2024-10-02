package testNGFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest extends BaseTest 

{
	
		GooglePage gp;
		
		
		@Test
		public void googlePageTitle()
		{
			gp=new GooglePage(driver);
			String actualTitle=gp.getGoogleHomePageTitle();
			Assert.assertEquals(actualTitle,"Google");
		}
		
		@Test
		public void getUrl()
		{
			gp=new GooglePage(driver);
			String actualUrl=gp.getGoogleURL();
			Assert.assertTrue(actualUrl.contains("google.com"));
		}
		
}
