package testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseclass.base;
import equation.Home;
import equation.Login;
import equation.Logout;
import equation.Teacher;
import equation.Teacherjoin;
import utils.utility;

public class newv extends base {
	int testID;
		WebDriver driver;
		Login login;
		Teacherjoin teacherjoin;
		Teacher teacher;
		Home home;
		Logout logout;
		
		@Parameters("browser")
		
		@BeforeTest
		public void OpenBrowser(String browsername) {
			System.out.println(browsername);
			if(browsername.equals("Chrome")) {
				
				driver=OpenChromeBrowser();
		}
			if(browsername.equals("Firefox")) {
				driver=OpenFirefoxBrowser();
				
			}
			if(browsername.equals("Edge")) {
				driver= OpenEdgeBrowser();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.khanacademy.org/");
			}
		
		
			@BeforeClass
		public void beforeclass() {
				 login =new Login(driver);
				 teacherjoin=new Teacherjoin(driver);
				 teacher=new Teacher(driver);
				 home=new Home(driver);
				 logout=new Logout(driver);
			}

			@BeforeMethod
			public void beforemethod() {
			
			 login.loginlink();
			 login.username();
			 login.password();
			 login.loginbutton();
			
			}
			
			@Test                                                             //first test case execute
			public void To_verify_the_teacherpage_joinclass() {
				testID=1;
				 teacherjoin.teacher();
				 
				 String url = driver.getCurrentUrl();
				 System.out.println(url);
				 
			
							 
				 if(url.equalsIgnoreCase("https://www.khanacademy.org/profile/me/teachers")) {
					 System.out.println("test case of url is pass");
				 }
				 
				 else {
					 System.out.println("test case of url is failed");
				 }
				 System.out.println(driver.getTitle());
				 teacherjoin.joinclass();
				 teacherjoin.entercode();
				 teacherjoin.continues();
				 teacherjoin.back();
			}
			@Test                                                 //second test case execute
			public void To_verify_the_Teacherpage() {
				testID=2;
				 teacher.teacher();
				 teacher.teacheremail();
				 teacher.addteacher();
				 teacher.remove();
				 teacher.removeteacher();
				 
			}
			@Test                                               //third test case execute
			public void To_verify_the_homepage() {
				testID=3;
				 home.courses();
				 home.navigate();
				 driver.navigate().back();
				 home.server();
				 driver.navigate().back();
				 home.Support();
				 driver.navigate().back();
				 home.Work();
				 driver.navigate().back();
				 home.Advertise();
				 driver.navigate().back();
				 home.seeall();
				 driver.navigate().back();
				 home.start();
				 driver.navigate().back();
			 home.progress();
			 driver.navigate().back();
				 home.profile();
				 Assert.fail();
	}
			@AfterMethod
			public void aftermethod(ITestResult result) throws IOException {
		 if(ITestResult.FAILURE==result.getStatus()) {
		
		 utility.captureScreenshot(driver, testID);
		 }
		logout.profilename();
		logout.loginout();
			
			}
			
			@AfterClass
			public void afterclass() {
				login =null;
				 teacherjoin=null;
				 teacher= null;
				 home=null;
				 logout=null;
			}
			@AfterTest
			public void browsreclose() {
				System.gc();//garbage collecter object delete memory clear
				driver.close();
	}
}
