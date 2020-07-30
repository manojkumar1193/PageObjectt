package Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomepage;
import ObjectRepository.RediffLoginpage;

public class LoginApplication {
	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Chromeselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		RediffLoginpage rd = new RediffLoginpage(driver);
		rd.sigin().click();
		rd.username().sendKeys("manoj");
		rd.password().sendKeys("manoj");
		rd.submit().click();
		RediffHomepage rh = new RediffHomepage(driver);
		Thread.sleep(2000);
		rh.home().click();
		rh.video().click();
	}
	

}
