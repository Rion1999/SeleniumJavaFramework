package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniuImplicitWaits {
	public static void main(String[] args) throws Exception {
		setUp();
	}
	 public static void setUp() throws Exception {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    //implicit wait
		    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		    driver.findElement(By.id("txtUsername")).click();
		    driver.findElement(By.id("txtUsername")).clear();
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).click();
		    driver.findElement(By.id("txtPassword")).clear();
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).click();
		    //explicit wait
		    WebDriverWait wait=new WebDriverWait(driver, 20);
		    WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		    

}
}

