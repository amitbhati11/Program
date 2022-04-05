package Javaproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propclass {
	
	public static void readpropfile() {
		
		String path="C:\\Users\\Admin_SRV\\git\\Program\\JavaProject\\src\\test\\java\\Javaproject\\Configproperties";
		Properties pr=new Properties();
		
		try {
			FileInputStream fis=new FileInputStream(path);
			
			pr.load(fis);
			
		System.out.println(pr.getProperty("Browser"));	
		
		BrowserConfig.Browser=pr.getProperty("Browser");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String [] xyz) {
		
		readpropfile();
	}

}
