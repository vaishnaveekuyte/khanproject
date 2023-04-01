package equation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	//Q) how to create pom class         //jitne webpage utne pom class
	//step1 to declare data member(variable) globally
	@FindBy(xpath="//a[@id='login-or-signup']")
	private WebElement loginlink;
	 
	@FindBy(xpath="(//input[@class='_1azps1NaN'])[1]")
	private WebElement username;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@role='button']")
	private WebElement loginbutton;
	
	
	
	//step2 Intialization of variable or data member
	
	public Login(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
	}	
	
	//step 3 create method
	
	public void loginlink() {
		loginlink.click();
		
	}
	public void username() {
		username.sendKeys("vaishukuyte1704@gmail.com");
		
	}
	
	public void password() {
		password.sendKeys("project@05");
		
	}
	
	public void loginbutton() {
		loginbutton.click();
		
	}
	
}
