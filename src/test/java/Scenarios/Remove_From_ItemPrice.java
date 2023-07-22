package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.RemoveFromItemPrice_Page;

public class Remove_From_ItemPrice extends BaseClass {
	
	@Test(priority=10,groups= {"sanity","invalid"})
	
	public void Remove_From_ItemPrice() throws InterruptedException
	{
		AddFruits af1 = new AddFruits();
		af1.AddFruits();
		RemoveFromItemPrice_Page rp=new RemoveFromItemPrice_Page(driver);
		rp.Hometext();
		rp.item_Price_List();
		rp.romove_item();
		rp.checkout();
		rp.Invalid_Coupon_Code();
		rp.apply();
		rp.order_placed();
		rp.Select_country();
		rp.check_Box();
		rp.proceed();
		rp.Home();
		//rp.vertical_scroll();
		
	}

}
