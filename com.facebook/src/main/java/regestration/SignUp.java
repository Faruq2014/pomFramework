package regestration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import resources.BasePage;

public class SignUp extends BasePage{
	
	public SignUp(WebDriver driver, ExtentTest test) {
	super(driver, test);	
	//this.driver = driver;
	}
	
	
	public void firstName(String firstname) {
		driver.findElement(By.id("u_0_c")).sendKeys(firstname);
		
		// to fail the test case
		//driver.findElement(By.id("_0_c")).sendKeys(firstname);
	}
	
	public void lasttName(String lastname) {
		driver.findElement(By.id("u_0_e")).sendKeys(lastname);
	}
	
	public void mobileNumber(String Mnumber) {
		driver.findElement(By.id("u_0_h")).sendKeys(Mnumber);
	}
	
	
	public void password(String pword) {
		driver.findElement(By.id("u_0_o")).sendKeys(pword);
	}
	
	public void birthmonth(int birthmonth) {
		WebElement element=	driver.findElement(By.xpath("//*[@name='birthday_month']"));
		Select select = new Select(element);
		select.selectByIndex(birthmonth);
			}
		public void birthday(int birthday) {
			WebElement element = driver.findElement(By.xpath("//*[@name='birthday_day']"));
			//to fail the test case
			//WebElement element = driver.findElement(By.xpath("//*[@='birthday_day']"));
			Select select = new Select(element);
			select.selectByIndex(birthday);
		}

		public void birthyear(String birthyear) {
			WebElement element = driver.findElement(By.xpath("//*[@name='birthday_year']"));
			Select select = new Select(element);
			select.selectByValue(birthyear);
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
	
	

}
