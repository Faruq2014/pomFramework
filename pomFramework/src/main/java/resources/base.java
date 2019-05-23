package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver driver;
	public static Properties prop;

	public base() {
		
	}

	public WebDriver intializeDriver() throws IOException {
		 prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Faruq\\pomFramework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
			 driver = new FirefoxDriver(); 	
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\SeleniumDriver\\MicrosoftWebDriver.exe");
			 driver = new EdgeDriver();   	
		}else {System.out.println("not a browser");}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
	return driver;
	
}
	
	public void getScreenshot(String result)throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.getFileExtension(src);
		String File = "C://test//"+result+"screenshot.png";
		String.valueOf(File);
		FileUtils.copyFiles(src,new File("C://test//"+result+"screenshot.png"));
	}
	public void takeScreenShot() {
		Date d = new Date();
		String screenshotFile=d.toString().replaceAll(":", "_").replaceAll(" ", "_")+".png";
		String filePath="C://test"+screenshotFile;
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.makeParentDirs(srcFile);
		}catch(IOException e) {e.printStackTrace();}
		
	}
	
}



