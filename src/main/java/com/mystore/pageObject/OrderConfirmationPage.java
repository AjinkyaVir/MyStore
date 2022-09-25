/**
 * 
 */
package com.mystore.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mystore.actionDriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author lenovo
 *
 */
public class OrderConfirmationPage extends BaseClass {

	
	@FindBy(xpath = "//p/Strong[contains(text(),'Your order on My Store is complete.')]")
	WebElement confirmMessage;

	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String confirmMsg() {
		
		String confirm_text = confirmMessage.getText();
		return confirm_text;
		
	}
	
	
	
}
