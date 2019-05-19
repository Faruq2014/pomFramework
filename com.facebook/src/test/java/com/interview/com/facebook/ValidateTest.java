package com.interview.com.facebook;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateTest extends BaseTest{
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void validateFBTest() {
		LoginValidate lv = new LoginValidate(driver);
		lv.Test();
		lv.Display();
	}


}
