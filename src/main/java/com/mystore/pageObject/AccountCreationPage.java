/**
 * 
 */
package com.mystore.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author lenovo
 *
 */
public class AccountCreationPage extends BaseClass {
	
	@FindBy(xpath = "//h1[text()=\"Create an account\"]")
	private WebElement createAccount;
	
	public AccountCreationPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyCreateAccount() {
		
		return Action.isDisplayed(driver, createAccount);
		
	}

}
