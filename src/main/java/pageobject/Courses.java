package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Courses {
	
	
	public WebDriver driver;
   By loog = By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a");
	
	
	
	public Courses(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement log() {
	   return driver.findElement(loog);
	 
	}
	
}
