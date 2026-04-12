package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		
	//	Excel File--->Workbook--->Sheets--->Rows----Cells
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx"); // open the file in reading mode
		
		XSSFWorkbook workbook = new XSSFWorkbook(file); // open the workbook 
		
		XSSFSheet sheet=workbook.getSheet("TestData");  // 
		
		int totalrows=sheet.getLastRowNum();
		
		int totalcell=sheet.getRow(1).getLastCellNum();
		
		System.out.println("total rows"+totalrows);
		System.out.println("total cell"+totalcell);
		
		
		
		
		

	}

}
