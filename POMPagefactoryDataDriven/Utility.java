package com.fw.POMPagefactoryDataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
	//execl read, write, screenshot, properties file
	static String excelFile;
	static FileInputStream file;
	static Workbook wbf;
	public static String excelStringData(String sheetName, int rowNumber, int cellNumber) throws EncryptedDocumentException, IOException
	{
		excelFile="C:\\New folder\\June2022_Selenium\\TestData\\File2.xlsx";
		file = new FileInputStream(excelFile);
		wbf = WorkbookFactory.create(file);
		String stringData = wbf.getSheet(sheetName).getRow(rowNumber-1).getCell(cellNumber-1).getStringCellValue();
		return stringData;
	}
	public static boolean execlBooleanData(String sheetName, int rowNumber, int cellNumber)
	{
		boolean booleanData = wbf.getSheet(sheetName).getRow(rowNumber-1).getCell(cellNumber-1).getBooleanCellValue();
		return booleanData;
	}
	public static double execlNumericData(String sheetName, int rowNumber, int cellNumber)
	{
		double numericData = wbf.getSheet(sheetName).getRow(rowNumber-1).getCell(cellNumber-1).getNumericCellValue();
		return numericData;
	}
}
