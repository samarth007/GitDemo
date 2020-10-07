package Project.Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import resource.Initial;

public class validate extends Initial{
    
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(validate.class.getName());
	
	@BeforeTest
	public void beforetest() throws IOException {
		
		driver=m();	
		log.info("driver");
	}
	
	
	@Test
	public void n() throws IOException {
		driver.get(p.getProperty("url"));
		log.info("home");
		LandingPage l = new LandingPage(driver);
	    Assert.assertEquals(l.getitle().getText(),"FEATURED COUR");
	    log.info("done");
	   
	}	
	
	@AfterTest
	public void aftertest() {
		System.out.println("uuuu");
		driver.close();
	}
}
