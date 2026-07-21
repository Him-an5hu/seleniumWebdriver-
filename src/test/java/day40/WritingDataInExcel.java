package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInExcel {

	public static void main(String[] args) throws IOException {
		
		
//		Excel File--->Workbook--->Sheets--->Rows----Cells
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile.xlsx");// create my file in directory 
		
		XSSFWorkbook workbook= new XSSFWorkbook(); // creating workbook 
		
		XSSFSheet sheet=workbook.createSheet("data"); // creating sheet in workbook in name of data
		
		XSSFRow row1=sheet.createRow(0);				//creating row in workbook 
		row1.createCell(0).setCellValue("JAVA");		//creating colomn in workbook 
		row1.createCell(1).setCellValue("200");
		row1.createCell(2).setCellValue("Automation");

		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue("100");
		row2.createCell(2).setCellValue("Automation");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("JAVA");
		row3.createCell(1).setCellValue("300");
		row3.createCell(2).setCellValue("Automation");
		
		workbook.write(file);  // workbook linked and start writing the 
		workbook.close();
		file.close();
		
		System.out.println("File is created ");
	}

}
