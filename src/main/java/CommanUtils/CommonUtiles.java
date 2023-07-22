package CommanUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import BaseClass.BaseClass;

public class CommonUtiles extends BaseClass {

	public void driverSetup()
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arun02\\eclipse-workspace\\Arun_Selenium_Assignment\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//prop.getProperty("globalWait");
		
	}
	
	public void getUrl()
	{
		driver.get(prop.getProperty("url"));
		
	}


}
