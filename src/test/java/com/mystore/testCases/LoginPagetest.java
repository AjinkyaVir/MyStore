package com.mystore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageObject.HomePage;
import com.mystore.pageObject.IndexPage;
import com.mystore.pageObject.LoginPage;


public class LoginPagetest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		
		lauchApp();
		
	}
	
	@AfterMethod
	public void close() {
		
		tearDown();
		
	}
	
	@Test
	public void loginIntoApp() {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.setEmailAndPassword(prop.getProperty("username"), prop.getProperty("passsword"));
		String actualUrl = homePage.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?controller=my-account";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	
}
