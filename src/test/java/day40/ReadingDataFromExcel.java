package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		
	//	Excel File--->Workbook--->Sheets--->Rows----Cells
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx"); // open the file in reading mode
		
		XSSFWorkbook workbook = new XSSFWorkbook(file); // open the workbook from file
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");  // sheet1 in in excel-- another way from index--  XSSFSheet sheet = workbook.getSheetAt(0);
		
		int totalrows=sheet.getLastRowNum();
		
		int totalcell=sheet.getRow(1).getLastCellNum();  // total number of cell in one row 
		
		System.out.println("total rows = "+totalrows);//4
		System.out.println("total cell = "+totalcell);// total cell = 4 in 1 row
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currectrow = sheet.getRow(r);
			
			
			for(int c=0;c<totalcell;c++)
			{
				XSSFCell cell= currectrow.getCell(c);    // tostring to covert everything in string format 
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		
		
		
		
		
		

	}

}
