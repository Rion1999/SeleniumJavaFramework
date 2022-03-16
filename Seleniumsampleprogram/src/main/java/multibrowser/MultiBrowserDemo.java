package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class MultiBrowserDemo {

	static WebDriver driver=null;
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername) {
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\RION ROY\\Desktop\\geckodriver-v0.30.0-win64\\geckodriver.exe\\");
		driver=new FirefoxDriver();
		}
		
	}
	@Test
	public  void test() {
		
		driver.get("https://www.google.com/");
		
	}
	@AfterTest
	public void teardown() {
		//driver.close();
		driver.quit();
		System.out.println("test completed");
	}

}
