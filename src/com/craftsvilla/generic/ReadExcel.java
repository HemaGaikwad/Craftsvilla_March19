package com.craftsvilla.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	
	public static File file = null;
	public static FileInputStream fin = null;
	public static Workbook wb = null;
	public static Sheet sh = null;
	
	public static String[][] getData(String filename, String sheetname) 
	{
		try
		{
			file = new File(filename);
			fin = new FileInputStream(file);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(sheetname);
			
			int rowNum = sh.getLastRowNum() +1;
			int cellNum = sh.getRow(0).getLastCellNum();
			
			String[][] credentials = new String[rowNum][cellNum]; 
			
			
			for(int i = 0; i<rowNum; i++)
			{
				Row r = sh.getRow(i);
				for(int j =0; j<cellNum; j++)
				{
					Cell c = r.getCell(j);
					String value = new DataFormatter().formatCellValue(c);
					
					credentials[i][j] = value;
				}
			}
			
			return credentials;
		}
		catch(Exception e)
		{
			return null;
		}
		
		
		
		
	}

}
