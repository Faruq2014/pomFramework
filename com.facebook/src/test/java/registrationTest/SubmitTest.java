package registrationTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import regestration.SignUp;

public class SubmitTest extends BaseTest{
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void submitTest() {
		SignUp sp = new SignUp(driver);
		sp.submit();
		

	}

}
