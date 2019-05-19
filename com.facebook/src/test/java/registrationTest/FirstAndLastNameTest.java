package registrationTest;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import regestration.SignUp;

public class FirstAndLastNameTest extends BaseTest{
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	 
	 
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
		log.info("opening browser");
	}
	
	
	@Test
	public void FirstNameTest() {
		SignUp sp = new SignUp(driver);
		sp.firstName("Sayem");
		log.info("writing first name");
		sp.lasttName("Mia");
		log.info("writing last name");
		
	}

}
