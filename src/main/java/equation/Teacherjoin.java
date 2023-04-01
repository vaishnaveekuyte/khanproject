package equation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teacherjoin {
	@FindBy(xpath="//span [text()='Teachers']")
	private WebElement teacher;
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement classcode;
	
	
	
	@FindBy(xpath="//input[@class='_q92ef6']")
	private WebElement entercode;
	
	
	@FindBy(xpath="//button[@role='button']")
	private WebElement continues;
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement back;
	
	public Teacherjoin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void teacher() {
		 teacher.click();
	}
	
	public void joinclass() {
		classcode.click();
	}
	
	public void entercode() {
		entercode.sendKeys("1234");
	}
	
	public void continues() {
		continues.click();
	}
	
	public void back() {
		back.click();
	}
	
	
}
