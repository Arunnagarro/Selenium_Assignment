package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class AddWalnuts_Page extends BaseClass {
	WebDriver  driver;
    public AddWalnuts_Page(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[30]/div[2]/a[2]")
    WebElement add;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[30]/div[3]/button[1]")
    WebElement addtocart_walnuts;
    
    public void Scroll_The_Screen()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
         //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void add_walnuts()
    
    {
    	add.click();
    	add.click();
    }
    public void addtocart() throws InterruptedException
    {
    	addtocart_walnuts.click();
    	logger.info("Add Walnuts");
    	Thread.sleep(2000);
    }

}
