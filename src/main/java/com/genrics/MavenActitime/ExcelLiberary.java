package com.genrics.MavenActitime;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLiberary implements AutoConstant
{
	//This is used so as not to do hard coding
	//Sir told us to give path and sheet name also..but i implemented AutoConstant so no need to give path and sheet name from outside
	public static String fetchExcelData(int row_num, int cell_num) throws IOException//Made static so no need to make object..code optimization
	{
		FileInputStream fis=new FileInputStream(excelsheet_path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		/*String cell_value=wb.getSheet(excellsheet_name).getRow(row_num).getCell(cell_num).getStringCellValue();
		wb.close();
		return cell_value;*/
		//Code Optmization
		return wb.getSheet(excellsheet_name).getRow(row_num).getCell(cell_num).getStringCellValue();
	}
}
