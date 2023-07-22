package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.AddWalnuts_Page;

public class Add_Walnuts extends BaseClass{

	@Test(priority=7,groups= {"sanity","invalid"})
	public void Add_Walnuts() throws InterruptedException
	{
		AddWalnuts_Page wp=new AddWalnuts_Page(driver);
		wp.Scroll_The_Screen();
		wp.add_walnuts();
		wp.addtocart();
	}
}
