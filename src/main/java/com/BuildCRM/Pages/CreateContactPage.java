package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;
import com.BuildCRM.genericLib.WebDriverCommonLib;

public class CreateContactPage {
	
@FindBy(xpath = "//input[@name='property(Last Name)']")private WebElement lastNameTb;
@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement saveBt;
@FindBy(xpath = "(//input[@value='Edit'])[2]")private WebElement editBtn;
@FindBy(xpath = "//input[@name='property(Last Name)']")private WebElement lastName1Tb;
@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement save1Bt;
@FindBy(xpath = "//input[@value='New']")private WebElement newpotentialBtn;
@FindBy(xpath = "//input[@name='property(Potential Name)']")private WebElement potentialnameTb;
@FindBy(xpath = "//input[@name='property(Closing Date)']")private WebElement closingdateTb;
@FindBy(xpath = "//input[@name='property(Account Name)']")private WebElement accountnameTb;
@FindBy(xpath = "//select[@name='property(Stage)']")private WebElement stagedd;
@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement save2Bt;
@FindBy(xpath = "//input[@name='newCompetitor']")private WebElement newcopetitorBtn;
@FindBy(xpath = "//input[@name='competitorname']")private WebElement newcompetitorTb;
@FindBy(xpath = "//input[@value='Save']")private WebElement save3Bt;
@FindBy(xpath = "//input[@value='New Sales Order']")private WebElement newsalesorderBtn;
@FindBy(xpath = "//input[@name='property(Subject)']")private WebElement subjectTb;
@FindBy(xpath = "//input[@name='property(Account Name)']")private WebElement accnameTb;
@FindBy(xpath = "//input[@id='txtProduct1']")private WebElement prdtnameTb;
@FindBy(xpath = "//input[@name='property(txtQty1)']")private WebElement qntyTb;
@FindBy(xpath = "//input[@id='txtListPrice1']")private WebElement listpriceTb;
@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement save4Bt;
@FindBy(xpath = "//input[@value='New Attachment']")private WebElement newattachBtn;
@FindBy(xpath = "//input[@value='Cancel']")private WebElement cancelBtn;
@FindBy(xpath = "//img[@src= '/crm/images/contemporary/logout.gif']")private WebElement logoutBtn;





//@FindBy(xpath = "//input[@name='property(First Name)']")private WebElement firstNameTb;
//@FindBy(xpath = "//input[@id='Account Name']")private WebElement accountNameTb;
//@FindBy(xpath = "//input[@id='Vendor Name']")private WebElement vendorNameTb;
//@FindBy(xpath = "//input[@name='property(Email)']")private WebElement emailTb;
//@FindBy(xpath = "//input[@name = 'property(Title)']")private WebElement titleTb;
//@FindBy(xpath = "//input[@name='property(Department)']")private WebElement departmentTb;
//@FindBy(xpath = "//input[@name='property(Phone)']")private WebElement phoneTb;
//@FindBy(xpath = "//input[@name='property(Home Phone)']")private WebElement homePhoneTb;
//@FindBy(xpath = "//input[@name='property(Other Phone)']")private WebElement otherPhoneTb;
//@FindBy(xpath = "//input[@name='property(Fax)']")private WebElement faxTb;
//@FindBy(xpath = "//input[@name='property(Mobile)']")private WebElement mobileTb;
//@FindBy(xpath = "//input[@name='property(Date of Birth)']")private WebElement dobTb;
//@FindBy(xpath = "//input[@name = 'property(Assistant)']")private WebElement assistantTb;
//@FindBy(xpath = "//input[@name='property(Asst Phone)']")private WebElement asstPhoneTb;
//@FindBy(xpath = "//input[@name='property(Reports To)']")private WebElement reportsToTb;
//@FindBy(xpath = "//input[@name='property(Mailing Street)']")private WebElement mailingStreetTb;
//@FindBy(xpath = "//input[@name='property(Other Street)']")private WebElement otherStreetTb;
//@FindBy(xpath = "//input[@name='property(Mailing City)']")private WebElement mailingCityTb;
//@FindBy(xpath = "//input[@name='property(Other City)']")private WebElement otherCityTb;
//@FindBy(xpath = "//input[@name='property(Mailing State)']")private WebElement mailingStateTb;
//@FindBy(xpath = "//input[@name='property(Other State)']")private WebElement otherStateTb;
//@FindBy(xpath = "//input[@name = 'property(Mailing Zip)']")private WebElement mailingZipTb;
//@FindBy(xpath = "//input[@name='property(Other Zip)']")private WebElement otherZipTb;
//@FindBy(xpath = "//input[@name='property(Mailing Country)']")private WebElement mailingCountryTb;
//@FindBy(xpath = "//input[@name='property(Other Country)']")private WebElement otherCountryTb;
//@FindBy(xpath = "//textarea[@name='property(Description)']")private WebElement descriptionTa;



 public CreateContactPage() 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

public WebElement getLastNameTb() {
	return lastNameTb;
}

public WebElement getSaveBt() {
	return saveBt;
}

public WebElement getEditBtn() {
	return editBtn;
}

public WebElement getLastName1Tb() {
	return lastName1Tb;
}

public WebElement getSave1Bt() {
	return save1Bt;
}

public WebElement getNewpotentialBtn() {
	return newpotentialBtn;
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

public WebElement getStagedd() {
	return stagedd;
}

public WebElement getSave2Bt() {
	return save2Bt;
}

public WebElement getNewcopetitorBtn() {
	return newcopetitorBtn;
}

public WebElement getNewcompetitorTb() {
	return newcompetitorTb;
}

public WebElement getSave3Bt() {
	return save3Bt;
}

public WebElement getNewsalesorderBtn() {
	return newsalesorderBtn;
}

public WebElement getSubjectTb() {
	return subjectTb;
}

public WebElement getAccnameTb() {
	return accnameTb;
}

public WebElement getPrdtnameTb() {
	return prdtnameTb;
}

public WebElement getQntyTb() {
	return qntyTb;
}

public WebElement getListpriceTb() {
	return listpriceTb;
}

public WebElement getSave4Bt() {
	return save4Bt;
}

public WebElement getNewattachBtn() {
	return newattachBtn;
}

public WebElement getCancelBtn() {
	return cancelBtn;
}

public WebElement getLogoutBtn() {
	return logoutBtn;
}

public void contactdetails(String lastName,String ln, String potential, String closingdate, String accountname, String competitor, String sub, String accname, String prdt, String qnty, String price) throws Throwable
{
	lastNameTb.sendKeys(lastName);
    saveBt.click();
    
    editBtn.click();
    lastNameTb.clear();
    lastName1Tb.sendKeys(ln);
    save1Bt.click();
    
    newpotentialBtn.click();
    potentialnameTb.sendKeys(potential);
    closingdateTb.sendKeys(closingdate);
    accountnameTb.sendKeys(accountname);
    Thread.sleep(1000);
     WebDriverCommonLib wlib = new WebDriverCommonLib();
	wlib.selectOption(stagedd, "Qualification");
	save2Bt.click();
	
	newcopetitorBtn.click();
	newcompetitorTb.sendKeys(competitor);
	save3Bt.click();
	
	newsalesorderBtn.click();
	subjectTb.sendKeys(sub);
	accnameTb.sendKeys(accname);
	prdtnameTb.sendKeys(prdt);
	qntyTb.sendKeys(qnty);
	listpriceTb.sendKeys(price);
	save4Bt.click();
	
	newattachBtn.click();
	cancelBtn.click();
	logoutBtn.click();
	
	
	
	
	
	
	
	
	
	
	
			
}
}

//public WebElement getFirstNameTb() {
//	return firstNameTb;
//}
//
//public WebElement getAccountNameTb() {
//	return accountNameTb;
//}
//
//public WebElement getVendorNameTb() {
//	return vendorNameTb;
//}
//
//public WebElement getEmailTb() {
//	return emailTb;
//}
//
//public WebElement getTitleTb() {
//	return titleTb;
//}
//
//public WebElement getDepartmentTb() {
//	return departmentTb;
//}
//
//public WebElement getPhoneTb() {
//	return phoneTb;
//}
//
//public WebElement getHomePhoneTb() {
//	return homePhoneTb;
//}
//
//public WebElement getOtherPhoneTb() {
//	return otherPhoneTb;
//}
//
//public WebElement getFaxTb() {
//	return faxTb;
//}
//
//public WebElement getMobileTb() {
//	return mobileTb;
//}
//
//public WebElement getDobTb() {
//	return dobTb;
//}
//
//public WebElement getAssistantTb() {
//	return assistantTb;
//}
//
//public WebElement getAsstPhoneTb() {
//	return asstPhoneTb;
//}
//
//public WebElement getReportsToTb() {
//	return reportsToTb;
//}
//
//public WebElement getMailingStreetTb() {
//	return mailingStreetTb;
//}
//
//public WebElement getOtherStreetTb() {
//	return otherStreetTb;
//}
//
//public WebElement getMailingCityTb() {
//	return mailingCityTb;
//}
//
//public WebElement getOtherCityTb() {
//	return otherCityTb;
//}
//
//public WebElement getMailingStateTb() {
//	return mailingStateTb;
//}
//
//public WebElement getOtherStateTb() {
//	return otherStateTb;
//}
//
//public WebElement getMailingZipTb() {
//	return mailingZipTb;
//}
//
//public WebElement getOtherZipTb() {
//	return otherZipTb;
//}
//
//public WebElement getMailingCountryTb() {
//	return mailingCountryTb;
//}
//
//public WebElement getOtherCountryTb() {
//	return otherCountryTb;
//}
//
//public WebElement getDescriptionTa() {
//	return descriptionTa;
//}



//public CharSequence getKorekar() {
//	return Korekar;
//}






	


