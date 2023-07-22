package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.AddDryFruits_Page;
import POM.AddFruits_Page;
import POM.ItemPrice_Page;

public class ItemPrice extends BaseClass {
	
	@Test(priority=9,groups= {"sanity","invalid"})
	
	public void ItemPrice() throws InterruptedException
	{
		AddDryFruits adf1=new AddDryFruits();
		adf1.addDryFruits();
		ItemPrice_Page ip=new ItemPrice_Page(driver);
		
		ip.itemprice();
		ip.ProeedToCheckout();
		ip.PlaceOrder();
		ip.Choose_Country();
		ip.TermAndCondition();
		ip.Proceed();
		
	}

}
