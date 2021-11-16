package com.BuildCRM.Potentials;

import org.testng.annotations.Test;

import com.BuildCRM.Pages.CreatePotentialsPage;
import com.BuildCRM.Pages.CustomViewPage;
import com.BuildCRM.Pages.PotentialsPage;
import com.BuildCRM.Pages.SignInPage;
import com.BuildCRM.genericLib.BaseTest;
import com.BuildCRM.genericLib.FileLib;

@Test
public class CreatePotentialsTest extends BaseTest{
	public void CreatePotential() throws Throwable
	{
	SignInPage sp = new SignInPage();
	FileLib flib = new FileLib();
	sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
	
	PotentialsPage pp=new PotentialsPage();
	pp.ClickPotentialT();
	
	CustomViewPage cvp2=new CustomViewPage();
	cvp2.clicknewPotentialBtn();

	CreatePotentialsPage  cpp = new CreatePotentialsPage();
	cpp.potentialpg(flib.readPropData(PROP_PATH, "potentialname"), flib.readPropData(PROP_PATH, "closingdate"), flib.readPropData(PROP_PATH, "accountname"));
	
}
}
