package com.interview.com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static WebDriver driver;
	
	public static void init(String bType){
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
	
	
	

	
	

}
