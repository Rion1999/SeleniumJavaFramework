package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pomlocators.Googlesearchpage;
import pomlocators.Googlesearchpageobject;

public class Extentreportstest {

	public static void main(String[] args) {
		 // start reporters
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentdemo.html");
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search", "It will search in google");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		test1.log(Status.INFO,"Starting testcase");
		
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google");
		
		driver.findElement(By.name("q")).sendKeys("india");
		test1.pass("Entered text");
		
		driver.findElement(By.cssSelector("div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div:nth-child(1) div.A8SBwf:nth-child(1) div.FPdoLc.lJ9FBc:nth-child(5) center:nth-child(1) > input.gNO89b")).sendKeys(Keys.RETURN); 
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();
		test1.pass("pressed enter button");
		
		driver.close();
		driver.quit();
		test1.pass("closed browser");
		test1.info("test Completed");
		
		
		 // calling flush writes everything to the log file
        extent.flush();
	}

}
