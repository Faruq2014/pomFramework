package registrationTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import regestration.SignUp;

public class RegistrationPageTest extends BaseTest{
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
		log.info("opening facebook");
	}
	@Test(priority=1)
	public void firstAndLastNameTest() {
		test = extent.startTest("BirthdayTest");
		SignUp sp = new SignUp(driver,test);
		sp.firstName("asraf");
		sp.lasttName("Islam");
		}
	
	@Test(priority=2)
	public void mobileNumberTest() {
		test = extent.startTest("mobileNumberTest");
		SignUp sp = new SignUp(driver,test);
		sp.mobileNumber("3334445555");
		}
	
	@Test(priority=3)
	public void passwordTest() {
		test = extent.startTest("passwordTest");
		SignUp sp = new SignUp(driver,test);
		sp.password("1234567");
		}
	
	@Test(priority=4)
	public void birthdayTest() {
		test = extent.startTest("birthdayTest");
		SignUp sp = new SignUp(driver,test);
		sp.birthday(22);
		sp.birthmonth(5);
		sp.birthyear("2000");
		}
	
	@Test(priority=5)
	public void maleOrFemaleTest() {
		test = extent.startTest("maleOrFemaleTest");
		SignUp sp = new SignUp(driver,test);
		sp.male();
		}
	@Test(priority=6)
	public void submitTest() {
		test = extent.startTest("submitTest");
        SignUp sp = new SignUp(driver,test);
		sp.submit();
		}
	
	@AfterTest
	public void finishTest() {
		driver.quit();
	}

	
	

}
