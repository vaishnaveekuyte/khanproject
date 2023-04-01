package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver OpenChromeBrowser() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		return driver;
	}

	public WebDriver OpenFirefoxBrowser() {
		
		WebDriver driver=new FirefoxDriver();
		
		return driver;
		
}

public WebDriver OpenEdgeBrowser() {
		
		WebDriver driver=new EdgeDriver();
		
		return driver;
		
}









}
