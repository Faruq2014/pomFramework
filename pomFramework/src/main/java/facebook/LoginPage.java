package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public  WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email= By.id("email");
	
	By password = By.id("pass");
	By login = By.xpath("//input[contains(@id,'u_0')]");
	
	public WebElement Email() {
		return driver.findElement(email);
	}
	public WebElement Password() {
		return driver.findElement(password);
	}
	public WebElement LogIn() {
		return driver.findElement(login);
	}

}
