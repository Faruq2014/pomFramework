package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.BasePage;

public class BaseTest {
	
	public ExtentReports extent = ExtentManager.getInstance();
	public static ExtentTest test;
	
	public static Logger log =LogManager.getLogger(BasePage.class.getName());
	public static WebDriver driver;
	
	public static void init(String bType){
		//test.log(LogStatus.INFO, "opening browser "+bType);
		
	if (bType.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(bType.equalsIgnoreCase("mogila")) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		
	}
	else if(bType.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\SeleniumDriver\\MicrosoftWebDriver.exe");
		 driver = new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	
	public void takeScreenShot(){
		// store screenshot in that file
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
		FileUtils.copyFile(src, new File("C:\\images\\pic.png"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		test.log(LogStatus.INFO,test.addScreenCapture("C:\\images\\pic.png"));
	}
	
	
	
	public void quit() {
		if(extent!=null) {
			extent.endTest(test);
			extent.flush();
		}
	}
	
	
	

	
	

}
