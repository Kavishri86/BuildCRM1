package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class PotentialsPage {
	
	@FindBy(xpath = "//a[text()= 'Potentials']")private WebElement potentialsT;
	
	public PotentialsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getPotentialsT() {
		return potentialsT;
	}
	
	public void ClickPotentialT()
	{
		potentialsT.click();
	}

}
