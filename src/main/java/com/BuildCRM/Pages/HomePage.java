package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class HomePage {
	
	
	@FindBy(xpath = "//a[text()='Home']")private WebElement HomeTab;
	
	
	public HomePage() 
	{
	  PageFactory.initElements(BaseTest.driver, this);
	  }
	public WebElement getHomeTab() {
		return HomeTab;
}
	public void clickHomeTab()
	{
		HomeTab.click();
	}
	
}
	


	
