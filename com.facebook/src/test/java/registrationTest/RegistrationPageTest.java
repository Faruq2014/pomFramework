package registrationTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import regestration.SignUp;

public class RegistrationPageTest extends BaseTest{
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=1)
	public void firstAndLastNameTest() {
		SignUp sp = new SignUp(driver);
		sp.firstName("asraf");
		sp.lasttName("Islam");
		}
	
	@Test(priority=2)
	public void mobileNumberTest() {
		SignUp sp = new SignUp(driver);
		sp.mobileNumber("3334445555");
		}
	
	@Test(priority=3)
	public void passwordTest() {
		SignUp sp = new SignUp(driver);
		sp.mobileNumber("3334445555");
		}
	
	@Test(priority=4)
	public void birthdayTest() {
		SignUp sp = new SignUp(driver);
		sp.birthday();
		sp.birthmonth();
		sp.birtyear();
		}
	
	@Test(priority=5)
	public void maleOrFemaleTest() {
		SignUp sp = new SignUp(driver);
		sp.male();
		}
	@Test(priority=6)
	public void submitTest() {
		SignUp sp = new SignUp(driver);
		sp.submit();
		}

	
	

}
