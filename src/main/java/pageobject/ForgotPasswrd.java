package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswrd {

	public WebDriver driver;
	By newlogin = By.cssSelector("[id='user_email']");
	By sendme = By.cssSelector("[type='submit']");
	
	public ForgotPasswrd(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement nlogin() {
	   return driver.findElement(newlogin);
	}
	
	public WebElement send() {
		return driver.findElement(sendme);
	}
	
	
	
	
	
	
	
	
}
