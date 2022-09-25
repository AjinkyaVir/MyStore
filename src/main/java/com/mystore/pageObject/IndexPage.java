package com.mystore.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass{

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signIn;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement myStroeLogo;
	
	@FindBy(id = "search_query_top")
	private WebElement searchBox;
	
	@FindBy(name = "submit_search")
	private WebElement searchBtn;
	
	
	public IndexPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public LoginPage clickOnSignIn() {
		Action.click(driver, signIn);
		return new LoginPage();
	}
	
	public boolean validateLogo() {
		return Action.isDisplayed(driver, myStroeLogo);
	}
	
	public String getMyStoreTitle() {
		String myStoreTitle = Action.getTitle(driver);
		return myStoreTitle;
	}
	
	public SearchResultPage searchProduct(String productName) {
		
		Action.type(searchBox, productName);
		Action.click(driver, searchBtn);
		return new SearchResultPage();
		
	}
	
	
}
