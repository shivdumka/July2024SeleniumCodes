package testNGFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMPageTest extends BaseTest
{


	OrangeHRMPage or;
	
	
	@Test
	public void OrangePageTitle()
	{
		or=new OrangeHRMPage(driver);
		String actualTitle=or.getOrangeHomePageTitle();
		Assert.assertEquals(actualTitle,"30-Day Advanced Free Trial | OrangeHRM");
	}

	
	@Test
	public void getUrl()
	{
		or=new OrangeHRMPage(driver);
		String actualUrl=or.getOrangeURL();
		Assert.assertTrue(actualUrl.contains("30-day-free-trial"));
	}
	
}
