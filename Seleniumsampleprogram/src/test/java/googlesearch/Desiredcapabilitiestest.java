package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desiredcapabilitiestest {

	public static void main(String[] args) {
		
		//DesiredCapabilities cap= new DesiredCapabilities();
		//cap.setCapability("ignoreProtectedModeSettings",true);
		System.setProperty("webdriver.ie.driver","C:\\Users\\RION ROY\\Desktop\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("america");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div:nth-child(1) div.A8SBwf:nth-child(1) div.FPdoLc.lJ9FBc:nth-child(5) center:nth-child(1) > input.gNO89b")).sendKeys(Keys.RETURN); 
		driver.close();
		
	}

}
