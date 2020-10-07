package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	By id = By.id("user_email");
	By pwd = By.id("user_password");
	By login = By.cssSelector("input[value='Log In']");
	By frgtpwd = By.cssSelector("[href *='password/new']");
	
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    }
	
	public WebElement getemail() {
		
	 return	driver.findElement(id);
	 
	}
	
	public WebElement getpwd() {
		return driver.findElement(pwd);	
	}
	
	public WebElement getlogin() {
		return driver.findElement(login);
	}
	
	public WebElement frgotpwd() {
		 return driver.findElement(frgtpwd);
	}
}
