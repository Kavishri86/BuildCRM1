package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class CreatePotentialsPage {

	@FindBy(xpath = "//input[@name='property(Potential Name)']")private WebElement potentialnameTb;
	@FindBy(xpath = "//input[@name='property(Closing Date)']")private WebElement closingdateTb;
	@FindBy(xpath = "//input[@name='property(Account Name)']")private WebElement accountnameTb;
	@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement saveBt;

   
    public CreatePotentialsPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }


	public WebElement getPotentialnameTb() {
		return potentialnameTb;
	}


	public WebElement getClosingdateTb() {
		return closingdateTb;
	}


	public WebElement getAccountnameTb() {
		return accountnameTb;
	}


	public WebElement getSaveBt() {
		return saveBt;
	}
	
	public void potentialpg(String potentialname, String closingdate, String accountname)
	{
		
		potentialnameTb.sendKeys(potentialname);
		closingdateTb.sendKeys(closingdate);
		accountnameTb.sendKeys(accountname);
		saveBt.click();
	}


	
	}

