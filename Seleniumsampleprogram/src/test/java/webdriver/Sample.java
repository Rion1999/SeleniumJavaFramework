package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hlo");
		List<WebElement> list = driver.findElements(By.xpath("//input"));
		int b= list.size();
		System.out.println(b );
		//WebElement a=driver.findElement(By.name("q"));
		//a.sendKeys("hlo");
		System.out.println(driver.getTitle());
	}

}
