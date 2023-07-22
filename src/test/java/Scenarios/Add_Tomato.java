package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.AddTomato_page;

public class Add_Tomato extends BaseClass {

	@Test(priority=6,groups= {"sanity","invalid"})
	public void add_Tomato() throws InterruptedException
	{
		AddTomato_page tp=new AddTomato_page(driver);
		tp.searchForTomato();
		tp.clickOnSearchButton();
		tp.increaseqantity();
		tp.Add_To_Cart();
	}
}
