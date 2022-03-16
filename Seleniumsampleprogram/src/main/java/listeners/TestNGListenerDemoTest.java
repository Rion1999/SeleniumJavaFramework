package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemoTest {
	@Test
	public void test1(){
		System.out.println("test1");
	}
	@Test
	public void test2(){
		System.out.println("test2");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("abcd");
		driver.findElement(By.id("txtPasswor")).sendKeys("hi");
	}
	@Test
	public void test3(){
		System.out.println("test3");
		throw new SkipException("this is skipped");
	}

}
