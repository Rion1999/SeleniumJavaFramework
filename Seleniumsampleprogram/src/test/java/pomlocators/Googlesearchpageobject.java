package pomlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearchpageobject {
	WebDriver driver=null;
	By textbox_search= By.name("q");
	By button_search= By.name("btnK");
	public  Googlesearchpageobject(WebDriver driver) {
		this.driver=driver;
	}
	public void sendtext(String text) {
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	public void searchbutton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
		
	}

}
