package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.mystore.actionDriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop ;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig() throws FileNotFoundException {
		
		
		try {
			prop = new Properties();
			
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "./configuration/config.properties");
			prop.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public static void lauchApp() {
		
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		if(browserName.contains("Chrome")){
			
			driver = new ChromeDriver();
			
		}else if(browserName.contains("FireFox")) {
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		Action.implicitWait(driver, 10);
		Action.pageLoadTimeOut(driver, 30);
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	public static void tearDown() {
		
		
		driver.close(); 
		
	}
	
	
}
