package com.interview.com.facebook;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;

public class ValidateTest extends BaseTest{
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void validateFBTest() {
		test = extent.startTest("validateFBTest");
		LoginValidate lv = new LoginValidate(driver, test);
		lv.Test();
	}
	@Test
	public void displayTest() {
		test = extent.startTest("displayTest");
		LoginValidate lv = new LoginValidate(driver, test);
		lv.Display();
	}
	
	@Test
	public void assertTest() {
		test = extent.startTest("assertTest");
		LoginValidate lv = new LoginValidate(driver,test);
		lv.assertation();
	}
	
	
	@AfterTest
	public void finishTest() {
		driver.quit();
	}


}
