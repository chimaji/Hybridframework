package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
public	XSSFWorkbook wb;
public	ExcelDataProvider()
	{
		try {
			File src=new File("./TestData/Data.xlsx");
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("file is not loaded"+e.getMessage());
		}
		
		
	}
	
public String getStringData(int sheetIndex,int row,int column)
{
	return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
}

public String getStringData(String sheetname,int row,int column)
{
	return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
}
public double getNumericData(String sheetname,int row,int column)
{
	return wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();

}



}
