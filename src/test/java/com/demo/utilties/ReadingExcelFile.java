package com.demo.utilties;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	XSSFWorkbook irctc;

	public ReadingExcelFile() {
		try {
			FileInputStream fis = new FileInputStream("./ExcelData/NewOneData.xlsx");
			irctc = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to find data" + e.getMessage());
		}
	}

	public String getStringData(int SheetIndex, int row, int col) {
		return irctc.getSheetAt(SheetIndex).getRow(row).getCell(col).getStringCellValue();
	}

	public String getStringData(String SheetName, int row, int col) {
		return irctc.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
	}
} 
