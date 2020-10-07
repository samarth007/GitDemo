package pageobject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
 
	public WebDriver driver;
	By signin = By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a");
	By title =  By.xpath("//*[@id=\"content\"]/div/div");
	By contact = By.xpath("//a[text()='Contact']");
	By courses = By.xpath("//a[text()='Courses']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getcontact() {
		return driver.findElement(contact);
	}
	
	public WebElement getlogin() {
		
		
		  return driver.findElement(signin);
	     
	}
	
	public WebElement getitle() {
		
		return driver.findElement(title);
	}
	
	public Courses course() {
		driver.findElement(courses).click();
		Courses c = new Courses(driver);
		return c;
		
	}
	
	
}
