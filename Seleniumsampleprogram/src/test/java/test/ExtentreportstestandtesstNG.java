package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pomlocators.Googlesearchpage;
import pomlocators.Googlesearchpageobject;

public class ExtentreportstestandtesstNG {
	static WebDriver driver=null;
	static ExtentReports extent=null;
	ExtentTest test1 =null;

		@BeforeTest
		public void setup(){
			 ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentdemo.html");
		        // create ExtentReports and attach reporter(s)
		        extent = new ExtentReports();
		        extent.attachReporter(htmlReporter);
		        // creates a toggle for the given test, adds all log events under it    
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				
				
				
		}
		@Test
		public void test() {
			test1 = extent.createTest("Google Search", "It will search in google");
			driver.get("https://www.google.com/");
			test1.pass("Navigated to google");
			
			driver.findElement(By.name("q")).sendKeys("india");
			test1.pass("Entered text");
			
			driver.findElement(By.cssSelector("div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div:nth-child(1) div.A8SBwf:nth-child(1) div.FPdoLc.lJ9FBc:nth-child(5) center:nth-child(1) > input.gNO89b")).sendKeys(Keys.RETURN); 
			//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();
			test1.pass("pressed enter button");
		}
		@AfterTest
		public void tearup() {
		
		
		driver.close();
		driver.quit();
		test1.pass("closed browser");
		test1.info("test Completed");
		
		
		 // calling flush writes everything to the log file
        extent.flush();
		}
	}


