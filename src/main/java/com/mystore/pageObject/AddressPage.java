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
public class AddressPage extends BaseClass {

	@FindBy(xpath = "//button[@name='processAddress']")
	WebElement processAddress;
	
	public AddressPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public ShippingPage processAddressCheckout() {
		Action.click(driver, processAddress);
		return new ShippingPage();
		
	}
	
}
