package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Currency;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataInExcel {

	public static void main(String[] args) throws IOException {
		
		
//		Excel File--->Workbook--->Sheets--->Rows----Cells
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile_dynamic.xlsx");// create my file in directory 
		
		XSSFWorkbook workbook= new XSSFWorkbook(); // creating workbook 
		
		XSSFSheet sheet=workbook.createSheet("dynamically_data"); // creating sheet in workbook in name of data
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows do you want to create ");
		int noOfrows = sc.nextInt();
		
		System.out.println("How many cell do you want create ");
		int noOfcells = sc.nextInt();
		
		
		
		for(int r=0;r<=noOfrows;r++)
		{
			XSSFRow current_rows = sheet.createRow(r);
			
			for(int c=0;c<noOfcells;c++)
			{
				XSSFCell cell = current_rows.createCell(c);
				cell.setCellValue(sc.next());			// we don't know what user will enter so sc.next
				
			}
		}
		
		
		workbook.write(file);  // workbook linked and start writing the 
		workbook.close();
		file.close();
		
		System.out.println("File is created ");
	}

}
