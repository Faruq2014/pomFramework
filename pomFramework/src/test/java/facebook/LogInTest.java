package facebook;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class LogInTest extends base {
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException {
		driver =intializeDriver();
		//driver.get(prop.getProperty("url"));
		log.info("driver intialized for login test");
	}
	
	
	@Test(dataProvider="getData")
	
	public void DoLogIn(String username, String password, String text) throws IOException {
		
		driver.get(prop.getProperty("url"));
		log.info("home page open for long in test");
		LoginPage lp = new LoginPage(driver);
		lp.Email().sendKeys(username);
		lp.Password().sendKeys(password);
		//System.out.println(text);
		log.info(text);
		lp.LogIn().click();
		log.info("log in successfully in log in test");
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
		log.info("log in test done for login test.");
	}
	
	@DataProvider
	public Object[][] getData() {
		
	Object [][]	data = new Object[2][3];
	
	data [0][0] = "khaled@gmail.com";
	data [0][1] ="abc123";
	data [0][2] ="for khaled facebook";
	
	data [1][0] ="forid@gmail.com";
	data [1][1] ="abc123";
	data [1][2] ="for forid facebook";
	
	return data;
		
	}

}
