package createApage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;

import resources.BasePage;

public class CreateApage extends BasePage{
	
	public CreateApage (WebDriver driver, ExtentTest test) {
		super(driver,test);
	}
	
	public void clickLink() {
		driver.findElement(By.xpath("//*[text()='Create a Page']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		String actualTitle="facebook";
		
		String expectedTitle = driver.getTitle();
		 SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualTitle, expectedTitle);
		
		   // Assert assert1 = new Assert();
		
	}
	
  public void login1() {

		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("mail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc123");
		driver.findElement(By.id("loginbutton")).click();
		
		
	
  }

}
