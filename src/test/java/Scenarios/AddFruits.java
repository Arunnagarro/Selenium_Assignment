package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.AddBrocolli_Page;
import POM.AddFruits_Page;

public class AddFruits extends BaseClass {
	
	
	@Test(priority=3,groups={"sanity","invalid"})
	public void AddFruits() throws InterruptedException
	{
		Thread.sleep(1000);
		AddFruits_Page af=new AddFruits_Page(driver);
		
		af.Scroll_Page();
		af.AddGrapes();
		af.AddToCart_Grapes();
		af.AddMango();
		af.AddToCart_Mango();
		af.Orange();
		af.AddToCart_Orange();
		
	}

}
