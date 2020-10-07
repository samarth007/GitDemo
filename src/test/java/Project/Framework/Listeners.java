package Project.Framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resource.Extentreport;
import resource.Initial;

public class Listeners extends Initial implements ITestListener{

	
	ExtentReports extent = Extentreport.getreport();
	ExtentTest test;
	ThreadLocal<ExtentTest> t = new ThreadLocal<ExtentTest>();
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "test passed");
		t.set(test);
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		t.get().fail(result.getThrowable());
	 WebDriver driver = null;
	String methodname = result.getMethod().getMethodName();
	try {
		driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch (IllegalArgumentException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IllegalAccessException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (NoSuchFieldException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (SecurityException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		t.get().addScreenCaptureFromPath(getscreenshot(methodname,driver), methodname);
		
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	}

	@Override
	public void onTestStart(ITestResult result) {
      
	 String mm = result.getMethod().getMethodName();
		
	 test =extent.createTest(mm);
	 t.set(test);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

   

	
	
	
	
	
	
}
