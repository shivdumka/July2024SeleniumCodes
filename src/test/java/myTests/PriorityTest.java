package myTests;

import org.testng.annotations.Test;

public class PriorityTest
{
	@Test
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	
	@Test	(priority=-100)
	public void cartTest()
	{
		System.out.println("cart Test");
	}
	
	@Test (priority=3)
	public void paymentTest()
	{
		System.out.println("Payment Test");
	}
	
}
