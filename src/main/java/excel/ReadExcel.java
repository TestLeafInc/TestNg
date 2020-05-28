package excel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	
	public static String[][] readDataFromExcel() throws IOException {
		
		// Pre-requisite: Create a .xlsx file with may be 2 columns and 3 rows and store it in a particular folder
		String fileName = "./data/Data.xlsx";
		
		// Step 1: Open the Excel File (XSSF -> This is the Prefix of the classes)
		//Workbook
		XSSFWorkbook wbook = new XSSFWorkbook(fileName);		
		
		// Step 2: Go to the specific sheet (read -> prefix of the method: get)
		XSSFSheet sheet = wbook.getSheet("Register Emails");
		//XSSFSheet firstSheet = wbook.getSheetAt(0);
		
		// Find the row count
		int totalRows = sheet.getLastRowNum(); // This includes the header
		System.out.println(totalRows);
		
		// Find the column count of header row
		int totalColumns = sheet.getRow(0).getLastCellNum();
		
		// I need to create String[][] 
		String[][] data = new String[totalRows][totalColumns]; //1) Create Array
		
		
		for (int i = 1; i <= totalRows; i++) { // Loop through Rows
			
			// Step 3: Go to each row
			XSSFRow row = sheet.getRow(i); // set the row index
			
			for (int j = 0; j < totalColumns; j++) { // loop through cols
				
				// Step 4: Go to the cell 
				XSSFCell cell = row.getCell(j); // set the col index
				
				// Step 5: Pick and Print the cell value
				String val = cell.getStringCellValue();
				System.out.println(val);
				data[i-1][j] = val; // store each cell value in array !!
			}
			
			
		}
		// Step 6: Close the workbook
		wbook.close();
		
		return data; // return from the method
		
	}

}
