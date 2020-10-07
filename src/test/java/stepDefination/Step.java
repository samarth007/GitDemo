package stepDefination;

import org.junit.runner.RunWith;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageobject.LandingPage;
import pageobject.LoginPage;
import resource.Initial;

@RunWith(Cucumber.class)
public class Step extends Initial  {

	
	   @Given("^initialise driver with chrome browser$")
	    public void initialise_driver_with_chrome_browser() throws Throwable {
                    
		   driver=m(); 
	    }


	    @When("^when user enters (.+) and (.+) logs on$")
	    public void when_user_enters_and_logs_on(String username, String password) throws Throwable {
            LoginPage ln = new LoginPage(driver);
			
		    ln.getemail().sendKeys(username);
		    ln.getpwd().sendKeys(password);
		    ln.getlogin().click();
	    }

	    
	    
	    @Then("^successful login $")
	    public void successful_login() throws Throwable {
	    	 LoginPage ln1 = new LoginPage(driver);
	    	 ln1.frgotpwd().click();
	    }


	    @And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }

	    @And("^navigate to loginportalpage$")
	    public void navigate_to_loginportalpage() throws Throwable {
	    	 LandingPage l = new LandingPage(driver);
		     l.getlogin();
			
		  
	    }
	    


}