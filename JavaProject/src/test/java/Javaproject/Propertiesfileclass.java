package Javaproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public  class Propertiesfileclass {
	
	
	static Properties prop=new Properties();
	static String filepath="C:\\Users\\Admin_SRV\\git\\Program\\JavaProject\\src\\test\\java\\Javaproject\\Properties";
	public static void  readpropertiesfiledata() {
		
		
		try {
			
			FileInputStream inputfile=new FileInputStream(filepath);
	prop.load(inputfile);
	
        System.out.println(prop.getProperty("browser"));
        
     WebDriverManagerclass.browser=prop.getProperty("browser");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void writepropertiesfile() {
		try {
			FileOutputStream outputfile=new FileOutputStream(filepath);
			
			prop.setProperty("rsult","pass");
			prop.store(outputfile, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String [] xyz) {
//writepropertiesfile();
		
		readpropertiesfiledata() ;
		
		
		
	}

}
