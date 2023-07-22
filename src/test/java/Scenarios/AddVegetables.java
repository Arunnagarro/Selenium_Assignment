package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.AddBrocolli_Page;

public class AddVegetables extends BaseClass {
	

	@Test(priority=1,groups={"sanity","invalid"})
	public void AddBrocolli() throws InterruptedException
	{
		AddBrocolli_Page app = new AddBrocolli_Page(driver);
		app.search();
		app.searchClick_field();
		app.addTheQantity();
		app.addtocart_field();
	}

}
