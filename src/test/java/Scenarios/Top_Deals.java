package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.TopDeals_Page;

public class Top_Deals extends BaseClass {
	
	@Test(priority=4,groups= {"sanity","invalid"})
	public void TopDeals() throws InterruptedException
	{
		TopDeals_Page td=new TopDeals_Page(driver);
		td.clickTop_Deals();
		td.tabOnNextPage();
		td.tabOnPreviousPage();
		td.tabOnFirstPage();
		td.tabOnLAstPage();
		
	}

}
