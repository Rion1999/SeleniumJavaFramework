package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoITDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		setUp();

	}
	 public static void setUp() throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 	WebDriver driver = new ChromeDriver();
		    driver.get("https://online-image-resizer.com/");
		    driver.findElement(By.id("browse")).click();
		    Runtime.getRuntime().exec("C:\\Users\\RION ROY\\Desktop\\Fileuploadscript.exe");
		    Thread.sleep(3000);
	 }

}
