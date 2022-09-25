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
public class ShippingPage extends BaseClass{

	@FindBy(xpath="//input[@id=\"cgv\"]")
	WebElement agreeChekBox;
	
	@FindBy(xpath="//button[@name=\"processCarrier\"]")
	WebElement clickShipping;
	
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}



	public void agreeCheckBox() {
		
		Action.click(driver, agreeChekBox);
		
	}
	
	public PaymentPage clickShipping() {
		Action.click(driver, clickShipping);
		return new PaymentPage();
	}
	
}
