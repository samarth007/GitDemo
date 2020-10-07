package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initial {
	
	public WebDriver driver;
	public Properties p;
	
	public WebDriver m() throws IOException {
		
	    p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Framework\\src\\main\\java\\resource\\Data.properties");
		p.load(fis);
	    String browser =p.getProperty("browser");
	 
		
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Framework\\src\\main\\java\\server\\chromedriver.exe");
	  driver = new ChromeDriver();
	}
  
	else if (browser.equals("firefox")) {
		System.out.println("firefox");
	}
	
	else {
		System.out.println("IE");
	}
		
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		return driver;
	}
	
	
	public String getscreenshot(String methodname, WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String screenfile = System.getProperty("user.dir")+"\\reports\\"+methodname+".png";
	FileUtils.copyFile(source, new File(screenfile));
	return screenfile;
	}
	
	
	
	
	
	
	
	
	
	
	

}
