package com.interview.com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import resources.BasePage;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, ExtentTest test) {
		super(driver,test);
		
	}
	public void username(String username) {
		driver.findElement(By.id("email")).sendKeys(username);
	}
	

	public void password(String password) {
	driver.findElement(By.id("pass")).sendKeys(password);	
	}
	
public WebElement login() {

	return driver.findElement(By.xpath("( //input[starts-with(@id,'u_0')])[1]"));
}
public void firstname(String fname) {
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(fname);
	}
public void lastname(String lname) {
	driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(lname);
	}
public void birthmonth() {
WebElement element=	driver.findElement(By.xpath("//*[@name='birthday_month']"));
Select select = new Select(element);
select.selectByIndex(5);
	}
public void birthday() {
	WebElement element = driver.findElement(By.xpath("//*[@name='birthday_day']"));
	Select select = new Select(element);
	select.selectByIndex(22);
}

public void birtyear() {
	WebElement element = driver.findElement(By.xpath("//*[@name='birthday_year']"));
	Select select = new Select(element);
	select.selectByValue("2000");
}
public void male() {
	Boolean male=driver.findElement(By.xpath("(//*[@name='sex'])[2]")).isSelected();
	if(male==true) {
		driver.findElement(By.xpath("(//*[@name='sex'])[2]")).click();
	}
	else {
		driver.findElement(By.xpath("(//*[@name='sex'])[1]")).click();
	}
	}
public void submit() {
	driver.findElement(By.xpath("//*[@name='websubmit']")).click();
	}

public void createApage() {
	driver.findElement(By.xpath("//*[text()='Create a Page']")).click();
	}





}
