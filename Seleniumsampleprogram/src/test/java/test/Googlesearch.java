package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomlocators.Googlesearchpage;

public class Googlesearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Googlesearchpage.type_search(driver).sendKeys("america");
		//driver.findElement(By.name("btnK")).click();
		Googlesearchpage.button_search(driver).sendKeys(Keys.RETURN); 
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);  
		
	}

}
