package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	By signin= By.xpath("//a[@class='signin']");
	By username = By.id("login1");
	By password = By.id("password");
	By go = By.xpath("//input[@type='submit']"); 
	
	public WebElement sigin() {
		return driver.findElement(signin);
	}
	public WebElement username() {
		return driver.findElement(username);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement submit() {
		return driver.findElement(go);
	}

}
