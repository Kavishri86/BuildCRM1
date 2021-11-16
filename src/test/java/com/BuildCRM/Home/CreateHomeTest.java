package com.BuildCRM.Home;

import org.testng.annotations.Test;

import com.BuildCRM.Pages.HomePage;
import com.BuildCRM.Pages.SignInPage;
import com.BuildCRM.genericLib.BaseTest;
import com.BuildCRM.genericLib.FileLib;
import com.BuildCRM.genericLib.WebDriverCommonLib;
@Test
public class CreateHomeTest extends BaseTest{
	
	public void CreateHome() throws Throwable {
	
	SignInPage sp = new SignInPage();
	FileLib flib = new FileLib();
	Thread.sleep(3000);
	sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
	
	//sp.login("rashmi@dell.com", "123456");
	
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	wlib.verify(flib.readPropData(PROP_PATH, "homeTitle"), wlib.getPageTitle(), 
			"homeTitle");
	Thread.sleep(3000);
	
	HomePage hp=new HomePage();
	hp.clickHomeTab();

}
}
