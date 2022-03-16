package utils;

import java.io.IOException;

public class ExcelUtilsDemo {

	public static void main(String[] args) throws IOException {
		ExcelUtils excel=new ExcelUtils("C:\\Users\\RION ROY\\eclipse-workspace\\Seleniumsampleprogram\\Excel\\New XLSX Worksheet.xlsx","Sheet1");

		excel.getrowcount();
		excel.getstringdata(0, 0);
		excel.getnumericdata(1, 1);
		excel.getcolumncount();
	}

}
