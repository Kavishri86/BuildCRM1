package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class ContactsPage {

	@FindBy(xpath = "//a[text()='Contacts']")private WebElement ContactsTab;

public ContactsPage() 
{
  PageFactory.initElements(BaseTest.driver, this);
  }

public WebElement getContactsTab() {
	return ContactsTab;
}
public void clickContactsTab() 	{
	
	ContactsTab.click();
}

 
}
