package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile_specific_cell.xlsx");// create my file in directory 
		
		XSSFWorkbook workbook= new XSSFWorkbook(); // creating workbook 
		
		XSSFSheet sheet=workbook.createSheet("dynamically_data"); // creating sheet in workbook in name of data
		
		XSSFRow row=sheet.createRow(3);
		XSSFCell cell=row.createCell(4);
		cell.setCellValue("Welcome");
		
		
		
		
		workbook.write(file);  // workbook linked and start writing the 
		workbook.close();
		file.close();
		
		System.out.println("File is created ");

	}

}
