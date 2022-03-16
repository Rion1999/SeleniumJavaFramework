package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook=null;
	static XSSFSheet sheet=null;
	public ExcelUtils(String excelpath,String sheetname) throws IOException {
		workbook=new XSSFWorkbook(excelpath);
		sheet=workbook.getSheet(sheetname);
		
	}

	public static void main(String[] args) throws IOException {
		//getrowcount();
		//getstringdata(0,0);
		//getnumericdata(1,1);

	}
	public static int getrowcount() throws IOException {
		int rowcount=0;
		
		rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		return rowcount;
	}
	public static int getcolumncount() throws IOException {
		
		int columncount=0;
		
		columncount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(columncount);
		return columncount;
	}
	public static String getstringdata(int rownum,int columnnum) throws IOException {
		String celldata=null;
		celldata=sheet.getRow(rownum).getCell(columnnum).getStringCellValue();
	//	System.out.println(celldata);
		return celldata;
	}
	public static void getnumericdata(int rownum,int columnnum) throws IOException {
		workbook=new XSSFWorkbook("C:\\Users\\RION ROY\\eclipse-workspace\\Seleniumsampleprogram\\Excel\\New XLSX Worksheet.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	//	System.out.println(sheet.getRow(rownum).getCell(columnnum).getNumericCellValue());
	}

}
