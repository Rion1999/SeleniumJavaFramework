package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomlocators.Googlesearchpageobject;

public class GooglesearchobjecttestNG2 {
	static WebDriver driver=null;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public  void googlesearchtest2() {
		
		Googlesearchpageobject gspo=new Googlesearchpageobject(driver);
		driver.get("https://www.google.com/");
		gspo.sendtext("america");
		gspo.searchbutton();
	}
	@Test
	public  void googlesearchtest3() {
		
		Googlesearchpageobject gspo=new Googlesearchpageobject(driver);
		driver.get("https://www.google.com/");
		gspo.sendtext("america");
		gspo.searchbutton();
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		System.out.println("test completed");
	}

}
