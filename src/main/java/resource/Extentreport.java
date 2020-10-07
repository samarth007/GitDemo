package resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {

   static ExtentReports extent;
	
	
	public static ExtentReports getreport() {
	
	String path= System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter  = new ExtentSparkReporter(path);
	reporter.config().setReportName("web testing");
	reporter.config().setDocumentTitle("test results");
	
	extent = new ExtentReports();
	
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "demo");
	return extent;
	}
}

