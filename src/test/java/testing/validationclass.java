package testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import equation.Home;
import equation.Login;
import equation.Logout;
import equation.Teacher;
import equation.Teacherjoin;

public class validationclass {
	WebDriver driver;
	Login login;
	Teacherjoin teacherjoin;
	Teacher teacher;
	Home home;
	Logout logout;
	
	
	
		@BeforeClass
	public void beforeclass() {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\vaishnavee\\Downloads\\chromedriver.exe\\");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	DesiredCapabilities cp = new DesiredCapabilities();
	cp.setCapability(ChromeOptions.CAPABILITY, options);
	options.merge(cp);
	
	
	driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.khanacademy.org/");
}

		@BeforeMethod
		public void beforemethod() {
		 login =new Login(driver);
		 login.loginlink();
		 login.username();
		 login.password();
		 login.loginbutton();
		
		}
		
		@Test                                                             //first test case execute
		public void To_verify_the_teacherpage_joinclass() {
			 teacherjoin=new Teacherjoin(driver);
			
			 teacherjoin.teacher();
			 
			 String url = driver.getCurrentUrl();
			 System.out.println(url);
			 
		SoftAssert soft =new SoftAssert();
			 
			//soft.assertEquals(url, "https://www.khanacademy.org/profile/me/teachers"); //soft assert
			 
			soft.assertNotEquals(url, "https://www.khanacademy.org/profile/me/teachers");//soft assert
//			boolean result = url.equals("https://www.khanacademy.org/profile/me/teachers"); //soft assert
//			 soft.assertTrue(result);//soft assert
//			 soft.assertFalse(result);//soft assert
			 soft.assertAll();
			 
			 
			 // Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/teachers");//hard assert
			// Assert.assertNotEquals(url, "https://www.khanacademy.org/profile/me/teachers");//hard assert
			// boolean result = url.equals("https://www.khanacademy.org/profile/me/teachers");//hard assert
			// Assert.assertTrue(result);//hard assert
			// Assert.assertFalse(result);//hard assert
						 
//			 if(url.equalsIgnoreCase("https://www.khanacademy.org/profile/me/teachers")) {
//				 System.out.println("test case of url is pass");
//			 }
//			 
//			 else {
//				 System.out.println("test case of url is failed");
//			 }
			 System.out.println(driver.getTitle());
			 teacherjoin.joinclass();
			 teacherjoin.entercode();
			 teacherjoin.continues();
			 teacherjoin.back();
		}
		@Test                                                 //second test case execute
		public void To_verify_the_Teacherpage() {
			 teacher=new Teacher(driver);
			 teacher.teacher();
			 teacher.teacheremail();
			 teacher.addteacher();
			 teacher.remove();
			 teacher.removeteacher();
			 
		}
		@Test                                               //third test case execute
		public void To_verify_the_homepage() {
			 home=new Home(driver);
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
}
		@AfterMethod
		public void aftermethod() {
	 logout=new Logout(driver);
	logout.profilename();
	logout.loginout();
		
		}
		
		@AfterClass
		public void afterclass() {
	driver.close();

		}
}
