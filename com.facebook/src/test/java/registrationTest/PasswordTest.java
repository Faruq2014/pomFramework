package registrationTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import regestration.SignUp;

public class PasswordTest extends BaseTest{
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void passwordTest() {
		SignUp sp = new SignUp(driver, test);
		sp.password("abc123");

	}
	
	@AfterTest
	public void finishTest() {
		driver.quit();
	}

}
