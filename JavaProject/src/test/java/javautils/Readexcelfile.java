package javautils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcelfile {
	
	public static void readexcel() {
		
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		
		String xclpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\JavaProject\\DataUtils\\Test1.xlsx";
		
		try {
			workbook=new XSSFWorkbook (xclpath);
			
		sheet=workbook.getSheet("Sheet1");
		  
		DataFormatter formatter=new DataFormatter();
		
	Object value=	formatter.formatCellValue(sheet.getRow(2).getCell(2));
	                    System.out.println(value);
		
		
			
			
			
		} catch (IOException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String [] xyz) {
		readexcel();	}

}
