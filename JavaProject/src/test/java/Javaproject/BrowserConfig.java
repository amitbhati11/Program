package Javaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserConfig {
	
	// set the browser
	// set browser configure
	//run test(Excute)
	
	static WebDriver driver;
	
	public static String Browser;
	
	
	public static void browserconfigure() {
		
		if(Browser.contains("Firefox")) {
		
		WebDriverManager.firefoxdriver().browserVersion("98.0.2").setup();
		
		driver=new FirefoxDriver();
		
	}if (Browser.contains("chrome")) {
		
	}
	}
	
	public static void runtest() {
		
		driver.get("http://only-testing-blog.blogspot.com/");
		
		driver.quit();
	}
	
	public static void main(String [] xyz) {
		Propclass.readpropfile();
		browserconfigure();
		runtest();
	}

}
