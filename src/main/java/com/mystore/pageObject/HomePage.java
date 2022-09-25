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
public class HomePage extends BaseClass {

	@FindBy(xpath = "//span[text()='My wishlists']")
	private WebElement myWishList;
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	private WebElement orderHistory;
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean validateMyWishist() {
		
		return  Action.isDisplayed(driver, myWishList);
	
	}
	
	public boolean validateOrderHistory() {
		
		return  Action.isDisplayed(driver, orderHistory);
	
	}
	
}
