package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBooking_Page {
	WebDriver  driver;
    public FlightBooking_Page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    @FindBy(xpath="//a[contains(text(),'Flight Booking')]")
    WebElement Flight_Booking;
    @FindBy(xpath="//input[@class='inputs ui-autocomplete-input valid']")
    WebElement  input_field;
    
    public void clickFlight_Booking() {
    	Flight_Booking.click();
    }
    	
    public void fill_Country()
    {
    	input_field.sendKeys("India");
    } 
}
