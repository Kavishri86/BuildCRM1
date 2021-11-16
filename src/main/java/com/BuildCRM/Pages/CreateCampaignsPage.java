package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class CreateCampaignsPage {
	
@FindBy(xpath = "//input[@name= 'property(Campaign Name)']")private WebElement campaignnameTab;
@FindBy(xpath = "//input[@name= 'property(Start Date)']")private WebElement startdateTab;
@FindBy(xpath = "//input[@name= 'property(End Date)']")private WebElement enddateTab;
@FindBy(xpath = "//input[@name= 'property(Expected Revenue)']")private WebElement expectedrevenueTab;
@FindBy(xpath = "//input[@name= 'property(Budgeted Cost)']")private WebElement budgetedcostTab;
@FindBy(xpath = "//input[@name= 'property(Actual Cost)']")private WebElement actualcostTab;
@FindBy(xpath = "//input[@name= 'property(Expected Response)']")private WebElement expectedresponseTab;
@FindBy(xpath = "//input[@name= 'property(Num sent)']")private WebElement numsentTab;
@FindBy(xpath = "//textarea[@name= 'property(Description)']")private WebElement descriptionTab;
@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement saveBt;

public CreateCampaignsPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
public WebElement getCampaignnameTab() {
	return campaignnameTab;
}
public WebElement getStartdateTab() {
	return startdateTab;
}
public WebElement getEnddateTab() {
	return enddateTab;
}
public WebElement getExpectedrevenueTab() {
	return expectedrevenueTab;
}
public WebElement getBudgetedcostTab() {
	return budgetedcostTab;
}
public WebElement getActualcostTab() {
	return actualcostTab;
}
public WebElement getExpectedresponseTab() {
	return expectedresponseTab;
}
public WebElement getNumsentTab() {
	return numsentTab;
}
public WebElement getDescriptionTab() {
	return descriptionTab;
}
public WebElement getSaveBt() {
	return saveBt;
}
public void campaignname(String campaignname)
{
	campaignnameTab.sendKeys(campaignname);

	saveBt.click();
}

	
}

