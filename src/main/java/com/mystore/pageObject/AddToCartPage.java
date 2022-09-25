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
public class AddToCartPage extends BaseClass{

	
	@FindBy(id = "quantity_wanted")
	private WebElement quantity;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(xpath = "//span[text()=\"Add to cart\"]")
	private WebElement clickOnAddToCart;
	
	@FindBy(xpath = "//div[@class='clearfix']//child::div[1]//h2/i")
	private WebElement addToCartMessage;
	
	@FindBy(xpath = "//div[@class='button-container']/child::a")
	private WebElement proceedToCheckOutBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterQuntity(String quantity1) {
		Action.type(quantity, quantity1);
	}
	
	public void selectSize(String size1) {
		Action.selectByVisibleText(size1, size);
	}
	
	public void clickAddToCart() {
		Action.click(driver, clickOnAddToCart);
	
	}
	
	public boolean validateAddToCartMessage() {
		return Action.isDisplayed(driver, addToCartMessage);
	}
	
	public OrderPage proceedToCheckOutBtn() throws Exception {
		Action.JSClick(driver, proceedToCheckOutBtn);
		return new OrderPage();
	}
	
}
