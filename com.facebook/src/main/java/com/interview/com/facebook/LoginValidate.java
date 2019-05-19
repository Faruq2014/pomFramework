package com.interview.com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BasePage;

public class LoginValidate extends BasePage{
	
	public LoginValidate() {}
	
	public LoginValidate(WebDriver driver) {
		super(driver);
	}
	
   By text = By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2");
	
	public String Test() {
		System.out.println(text);
		return driver.findElement(text).getText();
	}
	
	By display = By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2");
	public WebElement Display() {
		String title =driver.getTitle();
		System.out.println(title);
		return driver.findElement(display);
		
	}

}
