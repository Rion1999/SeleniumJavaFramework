package demo;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		setUp();

	}
	 public static void setUp() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RION ROY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.google.com/");
		    driver.findElement(By.name("q")).sendKeys("abcd");
		    driver.findElement(By.cssSelector("div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div:nth-child(1) div.A8SBwf:nth-child(1) div.FPdoLc.lJ9FBc:nth-child(5) center:nth-child(1) > input.gNO89b")).sendKeys(Keys.RETURN);
		   // driver.findElement(By.linkText("kids - Apps on Google Play")).click();
		    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    	       .withTimeout(Duration.ofSeconds(30L))
		    	       .pollingEvery(Duration.ofSeconds(2L))
		    	       .ignoring(NoSuchElementException.class);

		    	   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		    	     public WebElement apply(WebDriver driver) {
		    	       WebElement linkelement= driver.findElement(By.linkText("ABCD - Wikipedia"));
		    	       if(linkelement.isEnabled()) {
		    	    	   System.out.println("element found");
		    	       }
					return linkelement;
		    	     }
		    	   });

		    	   element.click();
		    Thread.sleep(3000);
		    driver.close();
		    driver.quit();
	 }


		
	

}
