package registrationTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import regestration.SignUp;

public class BirthdayTest extends BaseTest{
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void birthdayTest() {
		SignUp sp = new SignUp(driver);
		sp.birthday();
		sp.birthmonth();
		sp.birtyear();
		System.out.println("birhtday test is done sucessfully");

	}

}
