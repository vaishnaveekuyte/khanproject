package equation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
		@FindBy(xpath="(//span[text()='Courses'])[2]")    //courses
		private WebElement courses;

		@FindBy(xpath="(//a[@class='_eolar3c'])[1]")
		private WebElement navigate ;

		@FindBy(xpath="(//a[@class='_eolar3c'])[2]")
		private WebElement server;

		@FindBy(xpath="(//a[@class='_eolar3c'])[3]")
		private WebElement Support ;
		
		@FindBy(xpath="(//a[@class='_eolar3c'])[4]")
		private WebElement Work ;
		
		
		@FindBy(xpath="(//div[@class='_1xz0fezn'])[5]")
		private WebElement Advertise ;
		
	@FindBy(xpath="//a[@class='_19oyg81o']")
	private WebElement seeall ;                                  //seeall
	
	@FindBy(xpath="(//a[@class='_1448c3ub'])[1]")                        //start
	private WebElement start ;
		
		
		@FindBy(xpath="//span[text()='Progress']")   //progress
		private WebElement progress ;
		
		
		@FindBy(xpath="//span[text()='Profil']")    //profile
		private WebElement profile;
		
		@FindBy(xpath="//span[@data-test-id='learn-menu-button']")    //courses
		private WebElement courses1;
	
		
		
		public Home(WebDriver driver) {

			PageFactory.initElements(driver, this);

			}
	
		public void courses() {    //courses
			courses.click();
		}

		public void navigate () {
			navigate.click();
		}

		public void server() {
			server.click();
		}
		
		public void Support () {
			Support.click();
		}
		
		public void Work() {
			Work.click();
		}
		
		public void Advertise () {
			Advertise .click();
		}

		public void seeall () {     //seeall
			seeall .click();
		}
		
		public void start () {     //start
			start .click();
		}
		
		public void progress () {     //progress
			progress .click();
		}

		public void profile () {      //profile
			profile .click();
		}

		
		
		
}
