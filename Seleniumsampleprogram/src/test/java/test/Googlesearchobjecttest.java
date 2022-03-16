package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomlocators.Googlesearchpageobject;

public class Googlesearchobjecttest {
	static WebDriver driver=null;
	public static void main(String[] args) {
		googlesearchtest();
	}
	public static void googlesearchtest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Googlesearchpageobject gspo=new Googlesearchpageobject(driver);
		driver.get("https://www.google.com/");
		gspo.sendtext("america");
		gspo.searchbutton();
	}

}
