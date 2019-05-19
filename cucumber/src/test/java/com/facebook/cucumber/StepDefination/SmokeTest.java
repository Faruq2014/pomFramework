package com.facebook.cucumber.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		//System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
	    //driver = new FirefoxDriver();
	    
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	  		WebDriver driver = new ChromeDriver();
	  		
	    //driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	   
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
	  driver.findElement(By.id("email")).sendKeys("abc@gmail.com"); 
	  driver.findElement(By.id("pass")).sendKeys("avc123");
	}

	@Then("^user should be login seccessfully$")
	public void user_should_be_login_seccessfully() throws Throwable {
	 driver.findElement(By.id("loginbutton")).click();
	
	}
	
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
		 Thread.sleep(4000);
		// driver.quit();  
	   
	}



}
