package com.mystore.testCases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageObject.IndexPage;

public class IndexPageTest extends BaseClass{
	
	IndexPage indexPage;
	
	@BeforeMethod
	public void setUp() {
		
		lauchApp();
		
	}

	@AfterMethod
	public void close() {
		
		tearDown();
		
	}
	
	@Test
	public void verifyLogo() {
		
		indexPage = new IndexPage();
		boolean reuslt = indexPage.validateLogo();
		Assert.assertTrue(reuslt);
	}
	
	@Test
	public void verifyTitle() {
		
		String title = indexPage.getMyStoreTitle();
		Assert.assertEquals(title, "My Store");
	}
	
}
