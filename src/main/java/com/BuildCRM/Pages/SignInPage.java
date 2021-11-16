package com.BuildCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BuildCRM.genericLib.BaseTest;

public class SignInPage {
	
	@FindBy(id ="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath ="//input[@title='Sign In']") private WebElement SigninBtn;


    public SignInPage() 
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }


	public WebElement getUntb() {
		return untb;
	}


	public WebElement getPwtb() {
		return pwtb;
	}


	public WebElement getSigninBtn() {
		return SigninBtn;
	}
	public void login(String un, String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		SigninBtn.click();
	}
}