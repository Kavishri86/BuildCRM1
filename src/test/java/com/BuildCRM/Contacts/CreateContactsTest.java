package com.BuildCRM.Contacts;

import org.testng.annotations.Test;

import com.BuildCRM.Pages.ContactsPage;
import com.BuildCRM.Pages.CreateContactPage;
import com.BuildCRM.Pages.CustomViewPage;
import com.BuildCRM.Pages.SignInPage;
import com.BuildCRM.genericLib.BaseTest;
import com.BuildCRM.genericLib.FileLib;

@Test
public class CreateContactsTest extends BaseTest{
	public void CreateContact() throws Throwable
	{

	SignInPage sp = new SignInPage();
	FileLib flib = new FileLib();
	sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
	
	ContactsPage cp=new ContactsPage();
	cp.clickContactsTab();
	
	CustomViewPage cvp=new CustomViewPage();
	cvp.clicknewContactBtn();
	
	CreateContactPage ccp = new CreateContactPage();
	ccp.contactdetails(flib.readPropData(PROP_PATH, "lastname"),
	flib.readPropData(PROP_PATH, "ln"), flib.readPropData(PROP_PATH, "potential"),
	flib.readPropData(PROP_PATH, "closingdate"), flib.readPropData(PROP_PATH, "accountname"),
	flib.readPropData(PROP_PATH, "competitor"), flib.readPropData(PROP_PATH, "sub"), 
	flib.readPropData(PROP_PATH, "accname"), flib.readPropData(PROP_PATH, "prdt"), 
	flib.readPropData(PROP_PATH, "qnty"), flib.readPropData(PROP_PATH, "price"));
}
}
