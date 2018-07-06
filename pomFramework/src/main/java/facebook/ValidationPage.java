package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ValidationPage {

	public WebDriver driver;
	
	ValidationPage(WebDriver driver){
	this.driver=driver;	
	}
	
	By text = By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2");
	
	public String Test() {
		return driver.findElement(text).getText();
	}
	
	By display = By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2");
	public WebElement Display() {
		return driver.findElement(display);
		
	}
	
}
