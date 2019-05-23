package Utilities;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	public static ExtentReports extent;

	public static ExtentReports getInstance() {
	if (extent == null) {
	extent = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + "reports.html");
	extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
	}
	return extent;
	}

}
