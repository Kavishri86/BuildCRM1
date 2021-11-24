package com.BuildCRM.Campaigns;

import org.testng.annotations.Test;

import com.BuildCRM.Pages.CampaignsPage;
import com.BuildCRM.Pages.CreateCampaignsPage;
import com.BuildCRM.Pages.CustomViewPage;
import com.BuildCRM.Pages.SignInPage;
import com.BuildCRM.genericLib.BaseTest;
import com.BuildCRM.genericLib.FileLib;

/**
 * 
 * @author kavit
 *
 */
@Test
public class CreateCampaignsTest extends BaseTest {
	public void CreateCampaign() throws Throwable
	{
		
	SignInPage sp = new SignInPage();
	FileLib flib = new FileLib();
	sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
	
	CampaignsPage csp=new CampaignsPage();
	csp.clickcampaignTab();
	
	CustomViewPage cvp1=new CustomViewPage();
	cvp1.clicknewCampaignBtn();

	CreateCampaignsPage  ccsp = new CreateCampaignsPage();
	ccsp.campaignname(flib.readPropData(PROP_PATH, "campaignname"));
}
}
