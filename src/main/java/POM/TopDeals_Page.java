package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class TopDeals_Page extends BaseClass{
	WebDriver  driver;
    public TopDeals_Page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
    }
    //FAILURE case
    @FindBy(xpath="//a[contains(text(),'Top Deals')]")
    WebElement TopDeals;
    
    //@FindBy(xpath="//a[contains(text(),'Next')]")
    //@FindBy(xpath="//span[contains(text(),'2')]")
    @FindBy(how = How.PARTIAL_LINK_TEXT, using="#")
    WebElement next_button;
    
    @FindBy(xpath="//a[contains(text(),'Previous')]")
    WebElement previous_button;
    
    @FindBy(xpath="//a[contains(text(),'First')]")
    WebElement firstpage;
    
    @FindBy(xpath="//a[contains(text(),'Last')]")
    WebElement lastpage;
    
    public void clickTop_Deals() //throws InterruptedException
    {
    	TopDeals.click();
    	//Thread.sleep(2000);
    }
    public void tabOnNextPage() throws InterruptedException
    {
    	Thread.sleep(2000);
    	next_button.click();
    	next_button.click();
    	next_button.click();
    }
    public void tabOnPreviousPage()
    {
    	previous_button.click();
    }
    
    public void tabOnFirstPage()
    {
    	firstpage.click();
    }
    public void tabOnLAstPage()
    {
    	lastpage.click();
    }
}

