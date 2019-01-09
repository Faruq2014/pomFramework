package com.interview.com.facebook;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void loginTest() {
		LoginPage fb = new LoginPage(driver);
		fb.username("abc@yahoo.com");
		fb.password("avz123");
		//fb.login().click();
		fb.firstname("mohammed");
		fb.lastname("molla");
		fb.birthmonth();
		fb.birthday();
		fb.birtyear();
		fb.male();
		fb.submit();
		fb.createApage();
	}

}
