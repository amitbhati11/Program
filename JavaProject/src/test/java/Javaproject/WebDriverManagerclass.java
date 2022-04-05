package Javaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v97.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class WebDriverManagerclass {
public	static String browser;
	static WebDriverManager drivermanager;
	static WebDriver driver;
	/*public static void browsersetup() {
		browser ="chrome";


	}*/
	
	
	public static void browserconfiguration() {
		if (browser.contains("chrome")) {

			drivermanager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		if(browser.contains("Firefox")) {
			drivermanager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}

	public static void executetest() {
		driver.get("www.google.com");
		driver.quit();
	}

	public static void main(String[] args) {
		
		Propertiesfileclass.readpropertiesfiledata();

	//	browsersetup();
		browserconfiguration();
		executetest();
	}

}
