package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class CustomViewPage {
	
	@FindBy(xpath = "//input[@value='New Contact']")private WebElement newContactBtn;
	@FindBy(xpath = "//input[@value='New Campaign']")private WebElement newCampaignBtn;
    @FindBy(xpath = "//input[@value= 'New Potential']")private WebElement newPotentialBtn;
    @FindBy(xpath = "//input[@value='New Lead']")private WebElement newLeadBtn;
    @FindBy(xpath = "//input[@value='New Product']")private WebElement newProductBtn;
    public CustomViewPage() 
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    public WebElement getNewContactBtn() {
		return newContactBtn;
	}
    
    public void clicknewContactBtn() 	{
    	
    	newContactBtn.click();
    }

    public WebElement getNewCampaignBtn() {
		return newCampaignBtn;
	}
    
    public void clicknewCampaignBtn()
    {
    	newCampaignBtn.click();
    }

	public WebElement getNewPotentialBtn() {
		return newPotentialBtn;
	}
    public void clicknewPotentialBtn() 	{
    	
    	newPotentialBtn.click();
    }

	public WebElement getNewLeadBtn() {
		return newLeadBtn;
	}
	public void clicknewLeadBtn()
	{
		newLeadBtn.click();
	}

	public WebElement getNewProductBtn() {
		return newProductBtn;
	}
	public void clicknewProductBtn()
	{
		newProductBtn.click();
	}
}
