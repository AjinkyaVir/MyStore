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
 * @author Ajinkya
 *
 */
public class LoginPage extends BaseClass {

	@FindBy(id = "email_create")
	private WebElement setEmailAddress;

	@FindBy(id = "SubmitCreate")
	private WebElement createAccount;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement setEmailId;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement setPassward;

	@FindBy(id = "SubmitLogin")
	private WebElement signInBtn;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public HomePage setEmailAndPassword(String email, String pwd) {

		Action.type(setEmailId, email);
		Action.type(setPassward, pwd);
		Action.click(driver, signInBtn);
		return new HomePage();
	}

	public AddressPage setEmailAndPasswordOrder(String email, String pwd) {

		Action.type(setEmailId, email);
		Action.type(setPassward, pwd);
		Action.click(driver, signInBtn);
		return new AddressPage();
	}

	public AccountCreationPage createNewAccount(String emailId) {

		Action.type(setEmailAddress, emailId);
		Action.click(driver, createAccount);
		return new AccountCreationPage();
	}

}
