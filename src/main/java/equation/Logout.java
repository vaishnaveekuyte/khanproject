package equation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath="//span[@class='_wozql4 _13hnk7qk']")
	private WebElement profilename;
	
	@FindBy(xpath="//a[@class='_71vn8x8']")
	private WebElement loginout;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void profilename() {
		profilename.click();
	}
	public void loginout() {
		loginout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
