package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class ProductPage {
	
	@FindBy(xpath = "//a[text()='Products']")private WebElement productTab;
	
	public ProductPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getProductTab() {
		return productTab;
	}

	public void ClickProductTab()
	{
		productTab.click();
	}
	
}
