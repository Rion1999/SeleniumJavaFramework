package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lombok.Data;

public class Exceldataprovider {
	

	public static void main(String[] args) throws IOException {
		testdata("C:\\Users\\RION ROY\\eclipse-workspace\\Seleniumsampleprogram\\Excel\\New XLSX Worksheet.xlsx", "Sheet1");

	}
	static WebDriver driver=null;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test(dataProvider="test1")
	public void test1(String username,String password) throws InterruptedException {
		System.out.println(username +" | "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		
	}
	@DataProvider(name="test1")
	public static Object[][] getdata() throws IOException {
		Object data[][]=testdata("C:\\Users\\RION ROY\\eclipse-workspace\\Seleniumsampleprogram\\Excel\\New XLSX Worksheet.xlsx", "Sheet1");
		return data;
	}
	public static Object[][] testdata(String excelpath,String sheetname) throws IOException {
		ExcelUtils excel=new ExcelUtils(excelpath,sheetname);
		int rowcount=excel.getrowcount();
		int columncount=excel.getcolumncount();
		
		Object data[][]=new Object[rowcount-1][columncount];
		for(int i=1 ;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				String celldata=excel.getstringdata(i, j);
				//System.out.print(celldata+" | ");
				data[i-1][j]=celldata;
			}
			//System.out.println();
		}
		return data;
	}

}
