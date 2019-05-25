package createApage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseTest;

public class createApageTest extends BaseTest{
	
	@BeforeTest
	public void openBrowser() {
		init("chrome");
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void clickLinkTest() {
		test = extent.startTest("clickLinkTest");
		
		CreateApage cp = new CreateApage(driver,test);
		cp.clickLink();
		
		test = extent.startTest("pass clickLinkTest");
	}
	
	@Test(priority=2)
	public void login1Test() {
		test = extent.startTest("login1Test");
		
		CreateApage cp = new CreateApage(driver,test);
		
		cp.login1();
		test = extent.startTest(" pass login1Test");
	}
	
	@AfterTest
	public void finishTest() {
		driver.quit();
	}
	

}
