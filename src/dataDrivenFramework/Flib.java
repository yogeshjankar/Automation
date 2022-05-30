package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
     // method to read data from excel file
	
	public String readExcelData(String excelFilePath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;	
	}
	
	
	// method to get last row count
	
	public int getRowCount(String excelFilePath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
	}
	
	
	// method to write data in excel file

	public void writeExcelCell(String excelFilePath, String sheetName, int rc, int cl) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rc);
		
		Cell cell = row.createCell(cl);
		cell.setCellValue("Pass");
		
		FileOutputStream fos = new FileOutputStream(excelFilePath);
		wb.write(fos);
	}
	
	
	
	//method to read data from property file
	
	public String readPropertyFile(String excelPath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
