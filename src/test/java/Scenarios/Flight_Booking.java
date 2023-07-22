package Scenarios;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.FlightBooking_Page;

public class Flight_Booking extends BaseClass {
	
	@Test(priority=5,groups= {"sanity","invalid"})
	
	public void flight_booking()
	{
		FlightBooking_Page fb=new FlightBooking_Page(driver);
		
		fb.clickFlight_Booking();
		fb.fill_Country();
		
	}

}
