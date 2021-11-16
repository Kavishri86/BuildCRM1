package com.BuildCRM.genericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib {

	
	public String getPageTitle()
	{
		return BaseTest.driver.getTitle();
	}
	
	public void waitForTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(BaseTest.driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	
	public void verify(String actual, String expected, String page)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(page+" is Displayed, PASS",true);
	}
	
	public void selectOption(WebElement element, int index) {
		  Select sel = new Select(element);
		  sel.selectByIndex(index);
	  }
		public void selectOption1(WebElement element, String Value) {
			Select sel = new Select(element);
		    sel.selectByValue(Value);
		}
		public void selectOption(WebElement element, String Text) {
			Select sel = new Select(element);
		    sel.selectByVisibleText(Text);
		}
		
	
	
	public void scrollToElement(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)BaseTest.driver;
		 int x = element.getLocation().getX();
		 int y = element.getLocation().getY();
		 int yaxis = y+100;
		jse.executeScript("window.scrollBy("+x+","+yaxis+")");
	}

	
	}
	
	
