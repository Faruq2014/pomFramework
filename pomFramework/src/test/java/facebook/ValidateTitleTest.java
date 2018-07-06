package facebook;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class ValidateTitleTest extends base{
	

	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	@BeforeTest 
	public void intialize() throws IOException {
		driver=intializeDriver();
		log.info("driver is intialized for validation title page");
		driver.get(prop.getProperty("url"));
		
		log.info("facebook is opening");
	}
	@Test
	public void Validatefcebook() throws IOException {
	
	
	ValidationPage v = new ValidationPage(driver);
	
	Assert.assertTrue(v.Display().isDisplayed());
	log.info("validated the home page");
	
	/*v.Test();
	Assert.assertEquals(v.Test(), "Connect with friends and the\r\n" + 
			"world around you on Facebook.");
	*/
	
	String expectedtitle= driver.getTitle();
	String actualtitle = "Facebook - Log In or Sign Up";
	Assert.assertEquals(actualtitle, expectedtitle);
	log.info("validated the title");
	
}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
		log.info("done with validation page");
	}
	
}
