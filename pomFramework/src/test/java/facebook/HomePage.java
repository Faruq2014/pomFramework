package facebook;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base{
	 

	public static Logger log =LogManager.getLogger(base.class.getName());
	 
	@BeforeTest
	public void intialize() throws IOException {
		driver=intializeDriver();
		
		driver.get(prop.getProperty("url"));
		log.info("home page open and facebook open");	
		
	}
	
@Test
public void basePageNavigation() throws IOException {
	
	
	
	String expectedTitle =driver.getTitle();
	String ectualTitle ="Facebook - Log In or Sign Up";
	if (expectedTitle.equals(ectualTitle)){
		System.out.println("you are on right page");
		System.out.println();
		log.info("home page verify");
		
	}else {System.out.println("wrong page");}
}

@AfterTest
public void teardown() {
	driver.close();
	driver=null;
	log.info("home page closed");
}
}
