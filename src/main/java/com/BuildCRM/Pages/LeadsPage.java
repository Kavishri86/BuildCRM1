package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class LeadsPage {
	
	@FindBy(xpath = "//a[text()='Leads']")private WebElement leadsTab;

	public LeadsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLeadsTab() {
		return leadsTab;
	}
	
	public void clickLeadsTab()
	{
		leadsTab.click();
	}
}
