 package Project.Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import pageobject.LoginPage;
import resource.Initial;

public class Base extends Initial{
   
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void beforetest() throws IOException {
	   System.out.println("ppp");
	   System.out.println("kkkk");
		driver=m(); 	
		
	}
	
	
	@Test(dataProvider = "data")
	public void n(String user, String pass) throws IOException {
		
		 driver.get(p.getProperty("url"));
	     LandingPage l = new LandingPage(driver);
	        l.getlogin().click();
	        
	     LoginPage ln = new LoginPage(driver);
	    ln.getemail().sendKeys(user);
	    ln.getpwd().sendKeys(pass);
	    ln.getlogin().click();
	   log.info("joke");
	   
	 
	}
	
	
	@DataProvider
	public Object[][] data(){
		
		Object [] [] d = new Object[2][2];
		
		d[0][0]="samarthakrao";
		d[0][1]="007";
		
		
		d[1][0]="dummy";
		d[1][1]="006";
	
		
		return d;
	}
	
	@Test
	public void done() {
		System.out.println("done");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("kjkjk");
		driver.close();
	}       
}
