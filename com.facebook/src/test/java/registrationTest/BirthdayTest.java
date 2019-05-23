package registrationTest;

import static org.testng.Assert.fail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import regestration.SignUp;

public class BirthdayTest extends BaseTest{
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
		log.info("opening facebook");
	}
	@Test
	public void birthdayTest() {
		test = extent.startTest("BirthdayTest");
		SignUp sp = new SignUp(driver,test);
		sp.birthday(24);
		sp.birthmonth(7);
		sp.birthyear("asdf");
		log.info("writing birthday");
		System.out.println("birhtday test is done sucessfully");

	}
	
	@AfterTest
	public void finishTest() {
		driver.quit();
	}

}
