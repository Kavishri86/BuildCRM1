package com.BuildCRM.Leads;

import org.testng.annotations.Test;

import com.BuildCRM.Pages.CreateLeadsPage;
import com.BuildCRM.Pages.CustomViewPage;
import com.BuildCRM.Pages.LeadsPage;
import com.BuildCRM.Pages.SignInPage;
import com.BuildCRM.genericLib.BaseTest;
import com.BuildCRM.genericLib.FileLib;

@Test
public class CreateLeadsTest extends BaseTest{

public void CreateLeads() throws Throwable
	{
		SignInPage sp = new SignInPage();
		FileLib flib = new FileLib();
		sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
		
		LeadsPage lp = new LeadsPage();
		lp.clickLeadsTab();
		
		CustomViewPage cvp = new CustomViewPage();
		cvp.clicknewLeadBtn();
		
		CreateLeadsPage clp = new CreateLeadsPage();
		clp.Details(flib.readPropData(PROP_PATH, "company"), flib.readPropData(PROP_PATH, "ln"), flib.readPropData(PROP_PATH, "eln"));
				
	}

}
