package testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import equation.Home;
import equation.Login;
import equation.Logout;
import equation.Teacher;
import equation.Teacherjoin;
import equation.editPC;
import equation.searchb;

public class testlogin {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vaishnavee\\Downloads\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		WebDriver driver=new ChromeDriver(options);

	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get("https://www.khanacademy.org/");
	
	driver.manage().window().maximize();
	
	Login login=new Login(driver);
	
	login.loginlink();
	
	login.username();
	
	login.password();
	
	login.loginbutton();
	
	
	Teacherjoin teacherjoin=new Teacherjoin(driver);
	
	teacherjoin.teacher();
	
	teacherjoin.joinclass();
	
	teacherjoin.entercode();
	
	teacherjoin.continues();
	
	teacherjoin.back();
	
	Teacher teacher=new Teacher(driver);
	teacher.teacher();
	
	teacher.teacheremail();
	
	teacher.addteacher();
	
	teacher.remove();
	
	teacher.removeteacher();
	
	Home home=new Home(driver);
	
	home.courses();
	home.navigate();
	driver.navigate().back();
	Thread.sleep(2000);
	home.server();
	driver.navigate().back();
	Thread.sleep(2000);
	home.Support();
	driver.navigate().back();
	Thread.sleep(2000);
	home.Work();
	driver.navigate().back();
	Thread.sleep(2000);
	home.Advertise();
	driver.navigate().back();
	Thread.sleep(2000);
	home.seeall();
	driver.navigate().back();
	Thread.sleep(2000);
	home.start();
	driver.navigate().back();
	Thread.sleep(2000);
	home.progress();
	driver.navigate().back();
	Thread.sleep(2000);
	home.profile();
	driver.navigate().back();
	Thread.sleep(2000);
	
//	searchb sech=new searchb(driver);
//	
//	sech.search();
//	sech.close();
	
//	editPC edit=new editPC(driver);
//	
//	edit.editprofile();
//	edit.pclose();
//	edit.editcourses();
//	edit.cback();
//	edit.cclose();
//	
	
	
	
	Logout logout=new Logout(driver);
	
	logout.profilename();
	logout.loginout();
	
	
	
	}
}
