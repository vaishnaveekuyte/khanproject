package equation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchb {

	@FindBy(xpath="//span[@class='_gkt786u']")      //searchbutton
	private WebElement search;
	
	
	@FindBy(xpath="//a[@class='_dquds49']")      //searchbutton
	private WebElement close;
	
	public searchb(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void search() {
		search.click();
	}
	
	
	public void close() {
		close.click();
	}
	
	
	
	
	
}
