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
public class PaymentPage extends BaseClass{
	
	
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement bankWire;

	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public OrderConfirmationPage cliackBankWire() {
		
		Action.click(driver, bankWire);
		return new OrderConfirmationPage();
		
	}
	
	

}
