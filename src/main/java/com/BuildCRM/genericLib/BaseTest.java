 package com.BuildCRM.genericLib;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstants{

	public static WebDriver driver;
	
	/**
	 * This generic reusable method is used to open browser and enter URL
	 * @throws Throwable
	 */
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browser = flib.readPropData(PROP_PATH, "browser");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Enter Proper Browser name");
		}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String appUrl = flib.readPropData(PROP_PATH, "url");
		driver.get(appUrl);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		Thread.sleep(2000);
		wlib.verify(flib.readPropData(PROP_PATH, "loginTitle"), wlib.getPageTitle(), 
				"loginTitle");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}

