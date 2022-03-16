package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) throws InterruptedException {
		setUp();

	}
	 public static void setUp() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    ChromeOptions options =new ChromeOptions();
		    options.addArguments("--headless");
		 	WebDriver driver = new ChromeDriver(options);
		    driver.get("https://www.google.com/");
		    driver.findElement(By.name("q")).sendKeys("abcd");
		    driver.findElement(By.cssSelector("div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div:nth-child(1) div.A8SBwf:nth-child(1) div.FPdoLc.lJ9FBc:nth-child(5) center:nth-child(1) > input.gNO89b")).sendKeys(Keys.RETURN);
}
}
