package equation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teacher {
	@FindBy(xpath="//span [text()='Teachers']")
	private WebElement teacher;
	@FindBy(xpath="//input[@class='field blur-on-esc']")
	private WebElement teacheremail;
	
	@FindBy(xpath="//input[@id='add-coach']")
	private WebElement addteacher;
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement remove;
	
	@FindBy(xpath="//button[@data-test-id='remove-coach-button-confirm']")
	private WebElement removeteacher;
	
	
	
	public Teacher(WebDriver driver) {

	PageFactory.initElements(driver, this);
	
	}
	public void teacher() {
		 teacher.click();
	}
	
	
	
	public void teacheremail() {
		teacheremail.sendKeys("abc@gmail.com");
	}
	
	public void addteacher() {
		addteacher.click();
	}
	
	public void remove() {
		remove.click();
	}
	
	public void removeteacher() {
		removeteacher.click();
	}
	
}
