package utilitiesDriver;

public class AmazonTest {

	public static void main(String[] args) 
	{
		BrowserUtilities util=new BrowserUtilities();
		util.initDriver("Chrome");
		util.enterURL("https://www.google.com");
		String title=util.getTitle();
		System.out.println(title);
		if(title.contains("Google"))
		{
			System.out.println("Correct title-Test Case Passed");
		}
		else 
		{
			System.out.println("Incorrect title-Test Case Failed");
		}
		String url=util.getPageURL();
		System.out.println(url);
		util.quitBrowser();
	}

}
