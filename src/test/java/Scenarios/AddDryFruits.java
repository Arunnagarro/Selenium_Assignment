package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.AddDryFruits_Page;

public class AddDryFruits extends BaseClass {

	@Test(priority=2,groups={"sanity","invalid"})
	public void  addDryFruits() throws InterruptedException
	{
		Thread.sleep(1000);
		AddDryFruits_Page adf=new AddDryFruits_Page(driver);
		adf.Scroll_Screen();
		adf.Almonds();
		adf.AddToCart_Almomds();
		adf.AddToPista();
		adf.AddToCart_Pista();
		adf.Nuts_Mixture();
		adf.AddToCart_Nuts();
		
	}
}
