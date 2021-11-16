package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;
import com.BuildCRM.genericLib.WebDriverCommonLib;

public class CreateProductPage {
	
	@FindBy(xpath = "//input[@name='property(Product Name)']")private WebElement productnameTb;
	@FindBy(xpath = "//select[@name='property(Product Category)']")private WebElement productcatdd;
	@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement saveBtn;
	@FindBy(xpath = "(//input[@name='New'])[1]")private WebElement addtopricebookBtn;
	@FindBy(xpath = "(//input[@name='chk'])[1]")private WebElement selectoptn;
	@FindBy(xpath = "(//input[@name='listPrice1'])[1]")private WebElement listpriceTb;
	@FindBy(xpath = "//input[@name='']")private WebElement addtopricebBtn;
	@FindBy(xpath = "//input[@value='New Task']")private WebElement newtaskBtn;
	@FindBy(xpath = "//input[@name='property(subject)']")private WebElement subjectTb;
	@FindBy(xpath = "//input[@value='Save']")private WebElement save1Btn;
	@FindBy(xpath = "//input[@value='New Case']")private WebElement newcaseBtn;
	@FindBy(xpath = "//select[@name='property(Status)']")private WebElement statusdd;
	@FindBy(xpath = "//select[@name='property(Case Origin)']")private WebElement caseorigindd;
	@FindBy(xpath = "//input[@name='property(Subject)']")private WebElement subject1Tb;
	@FindBy(xpath = "//input[@value='Save']")private WebElement save2Btn;
	@FindBy(xpath = "//img[@src= '/crm/images/contemporary/logout.gif']")private WebElement logoutBtn;
	
	public CreateProductPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getProductnameTb() {
		return productnameTb;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getAddtopricebookBtn() {
		return addtopricebookBtn;
	}

	public WebElement getSelectoptn() {
		return selectoptn;
	}

	public WebElement getListpriceTb() {
		return listpriceTb;
	}

	public WebElement getAddtopricebBtn() {
		return addtopricebBtn;
	}

	public WebElement getNewtaskBtn() {
		return newtaskBtn;
	}

	public WebElement getSubjectTb() {
		return subjectTb;
	}

	public WebElement getSave1Btn() {
		return save1Btn;
	}

	public WebElement getNewcaseBtn() {
		return newcaseBtn;
	}

	public WebElement getSubject1Tb() {
		return subject1Tb;
	}
	
	public WebElement getStatusdd() {
		return statusdd;
	}

	public WebElement getCaseorigindd() {
		return caseorigindd;
	}

	public WebElement getSave2Btn() {
		return save2Btn;
	}
	
	public WebElement getProductcatdd() {
		return productcatdd;
	}
	
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public void productdetails(String product, String lstpr, String sub, String sub1) throws Throwable
	{
		productnameTb.sendKeys(product);
		Thread.sleep(2000);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.selectOption(productcatdd, "Hardware");
		saveBtn.click();
		
		addtopricebookBtn.click();
		selectoptn.click();
		listpriceTb.sendKeys(lstpr);
		addtopricebBtn.click();
		
		newtaskBtn.click();
		subjectTb.sendKeys(sub);
		save1Btn.click();
		
		newcaseBtn.click();
		
		Thread.sleep(3000);
//	    
		WebDriverCommonLib wlib1 = new WebDriverCommonLib();
		wlib1.selectOption(statusdd, "On Hold");
		
		Thread.sleep(2000);
		
		WebDriverCommonLib wlib2 = new WebDriverCommonLib();
		wlib2.selectOption(caseorigindd, "Phone");
		
		subject1Tb.sendKeys(sub1);
		save2Btn.click();
		
		
		logoutBtn.click();
		
		
	}

//	public WebElement getProductcatdd() {
//		return productcatdd;
	//}

	

	
}
