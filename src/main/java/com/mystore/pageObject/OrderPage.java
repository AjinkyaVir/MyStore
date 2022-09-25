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
public class OrderPage extends BaseClass{
	
	@FindBy(xpath = "(//td[@class='cart_unit']//span)[2]")
	WebElement unitPrice;
	
	@FindBy(xpath = " //span[@id='total_price']")
	WebElement totalPrice;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	WebElement proceedToCheckOut;
	
	
	
	public OrderPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	public double getUnitPrice() {
		
		String unit_Price = unitPrice.getText();
		String unit = unit_Price.replace("[^a-zA-Z0-9]", "");
		double finalUnitPrice = Double.parseDouble(unit);
		return finalUnitPrice/100;
		
		
	}
	
	public double getTotalPrice() {
		
		String total_Price = totalPrice.getText();
		String total = total_Price.replace("[^a-zA-Z0-9]", "");
		double finalTotalPrice = Double.parseDouble(total);
		return finalTotalPrice/100;
		
	}
	
	public LoginPage clickOnProceedCheckout() {
		Action.click(driver, proceedToCheckOut);
		System.out.println("Clicked On Checkout....");
		return new LoginPage();
		
	}
	

}
