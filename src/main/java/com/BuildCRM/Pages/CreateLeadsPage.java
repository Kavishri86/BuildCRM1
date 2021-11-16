package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class CreateLeadsPage {
	
	@FindBy(xpath = "//input[@name='property(Company)']")private WebElement CompanyTb;
	@FindBy(xpath = "//input[@name='property(Last Name)']")private WebElement LastnameTb;
	@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@value='Edit']")private WebElement EditBtn;
	@FindBy(xpath = "//input[@name='property(Last Name)']")private WebElement Lastname1Tb;
	@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement save1Btn;

	@FindBy(xpath = "//input[@value='Clone']")private WebElement CloneBtn;
	@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement save2Btn;
	
	@FindBy(xpath = "//input[@name='Duplicate2']")private WebElement FndMrgBtn;
	@FindBy(xpath = "//input[@value='101']")private WebElement radioBtn;
	@FindBy(xpath = "//input[@value='Search']")private WebElement searchBtn;
	@FindBy(xpath = "(//input[@name='chk'])[3]")private WebElement checkbox1;
	@FindBy(xpath = "(//input[@name='chk'])[4]")private WebElement checkbox2;
	@FindBy(xpath = "//input[@value='View Duplicates']")private WebElement viewdupBtn;
    @FindBy(xpath = "(//input[@id='masterrecord'])[1]")private WebElement selectoptnradioBtn;
    @FindBy(xpath = "(//input[@value='Merge'])[2]")private WebElement mergeBtn;
    @FindBy(xpath = "//img[@src= '/crm/images/contemporary/logout.gif']")private WebElement logoutBtn;
    
    public CreateLeadsPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }

	public WebElement getCompanyTb() {
		return CompanyTb;
	}

	public WebElement getLastnameTb() {
		return LastnameTb;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public WebElement getSave1Btn() {
		return save1Btn;
	}

	public WebElement getCloneBtn() {
		return CloneBtn;
	}

	public WebElement getSave2Btn() {
		return save2Btn;
	}

	public WebElement getFndMrgBtn() {
		return FndMrgBtn;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public WebElement getViewdupBtn() {
		return viewdupBtn;
	}

	public WebElement getSelectoptnradioBtn() {
		return selectoptnradioBtn;
	}

	public WebElement getMergeBtn() {
		return mergeBtn;
	}
    public void Details(String company, String ln, String eln)
    {
    CompanyTb.sendKeys(company);
    LastnameTb.sendKeys(ln);
    saveBtn.click();
    EditBtn.click();
    LastnameTb.clear();
    Lastname1Tb.sendKeys(eln);
    save1Btn.click();
    
    CloneBtn.click();
    save2Btn.click();
    FndMrgBtn.click();
    radioBtn.click();
    searchBtn.click();
    
    checkbox1.click();
    checkbox2.click();
    viewdupBtn.click();
    selectoptnradioBtn.click();
    mergeBtn.click();
    
    }

	public WebElement getLastname1Tb() {
		return Lastname1Tb;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
}


