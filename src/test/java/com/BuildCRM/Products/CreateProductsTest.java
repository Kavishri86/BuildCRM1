package com.BuildCRM.Products;


import org.testng.annotations.Test;

import com.BuildCRM.Pages.CampaignsPage;
import com.BuildCRM.Pages.ContactsPage;
import com.BuildCRM.Pages.CreateCampaignsPage;
import com.BuildCRM.Pages.CreateContactPage;
import com.BuildCRM.Pages.CreatePotentialsPage;
import com.BuildCRM.Pages.CreateProductPage;
import com.BuildCRM.Pages.CustomViewPage;
import com.BuildCRM.Pages.HomePage;
import com.BuildCRM.Pages.PotentialsPage;
import com.BuildCRM.Pages.ProductPage;
import com.BuildCRM.Pages.SignInPage;
import com.BuildCRM.genericLib.BaseTest;
import com.BuildCRM.genericLib.FileLib;
import com.BuildCRM.genericLib.WebDriverCommonLib;

public class CreateProductsTest extends BaseTest {
	
@Test
	//public static void main(String args[]) throws Throwable {
 public void CreateProduct() throws Throwable
{
//		BaseTest bt = new BaseTest();
//		bt.openBrowser();
	SignInPage sp = new SignInPage();
	FileLib flib = new FileLib();
	sp.login(flib.readPropData(PROP_PATH, "un"),flib.readPropData(PROP_PATH, "pw"));
	
		ProductPage pp = new ProductPage();
		pp.ClickProductTab();
		
		CustomViewPage cpe = new CustomViewPage();
		cpe.clicknewProductBtn();
		Thread.sleep(2000);
		
		CreateProductPage cpp = new CreateProductPage();
		cpp.productdetails(flib.readPropData(PROP_PATH, "product"), 
				flib.readPropData(PROP_PATH, "lstpr"), flib.readPropData(PROP_PATH, "sub"),
				flib.readPropData(PROP_PATH, "sub1"));
		Thread.sleep(2000);
		
		
		
	}	
				
	}
	
	



