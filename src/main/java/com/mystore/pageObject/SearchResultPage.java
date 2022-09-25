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
public class SearchResultPage extends BaseClass{
	
	
	@FindBy(xpath = "//img[@title=\"Faded Short Sleeve T-shirts\"]")
	private WebElement searchProduct;
	
	public SearchResultPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean isProductDisplayed() {
		return Action.isDisplayed(driver, searchProduct);
	}
	
	public AddToCartPage clickOnProduct() {
		Action.click(driver, searchProduct);
		return new AddToCartPage();
	}

}
