package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {
	WebDriver driver;
	public RediffHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 //@FindBy(xpath="//a[contains(@href,'http://rediff.com']")
	@FindBy(linkText="Home")
	  WebElement home;
	
	@FindBy(className="vdicon")
	  WebElement videos;
	 
	 public WebElement home() {
		 return home;
	 }
	 public WebElement video() {
		 return videos;
	 }

}
