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
public class OrderSummeryPage extends BaseClass {

	
	@FindBy(xpath = " (//button[@type='submit'])[2]")
	WebElement confirmOrder;

	public OrderSummeryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage conformPage() {
		
		Action.click(driver, confirmOrder);
		return new OrderConfirmationPage();
		
	}
	
}
