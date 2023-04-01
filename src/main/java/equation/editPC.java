package equation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editPC {
	@FindBy(xpath="(//button[@role='button'])[1]")     //editprofile
	private WebElement editprofile;
	
	
	@FindBy(xpath="//span[@class='close']")     //editprofile
	private WebElement pclose;

	@FindBy(xpath="//button[@class='_12iepmsr']")      //editcourses
	private WebElement editcourses;
	
	@FindBy(xpath="//div[text()='Back']")     
	private WebElement cback;
	
	
	@FindBy(xpath="//button[@class='_xrgghrk']")     
	private WebElement cclose;


	public editPC(WebDriver driver) {

		PageFactory.initElements(driver, this);

		}


	public void editprofile () {     //editprofile
		editprofile .click();
	}
	public void pclose () {     
		pclose .click();
	}
	public void editcourses () {       //editcourses
		editcourses .click();
	}
	public void cback () {     
		cback .click();
	}
	public void cclose () {     
		cclose .click();
	}

	

	


















}
