package pomlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Googlesearchpage {
	static WebElement a=null;
	public static WebElement type_search(WebDriver driver){
		a= driver.findElement(By.name("q"));
		return a;
		
	}
	public static WebElement button_search(WebDriver driver){
		a= driver.findElement(By.name("btnK"));
		return a;
		
	}

}
