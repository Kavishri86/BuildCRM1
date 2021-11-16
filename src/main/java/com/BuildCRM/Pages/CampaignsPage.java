package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class CampaignsPage {
	
	@FindBy(xpath = "//a[text()='Campaigns']")private WebElement campaignTab;
	
	public CampaignsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCampaignTab() {
		return campaignTab;
	}
     public void clickcampaignTab() 
     {
    	 campaignTab.click();
     }

	
		
	}

























