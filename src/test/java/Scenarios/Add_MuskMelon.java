package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.AddMuskMelon_Page;

public class Add_MuskMelon extends BaseClass {
	
	@Test(priority=8,groups= {"sanity","invalid"})
	
	public void Add_MuskMelon() throws InterruptedException
	{
		AddMuskMelon_Page mp=new AddMuskMelon_Page(driver);
		mp.searchForMuskMelon("Musk Melon");
		mp.button();
		mp.add_quantity();
		mp.decrease_quantity();
		mp.Added();
		logger.info("Musk Melon Added");
	}

}
