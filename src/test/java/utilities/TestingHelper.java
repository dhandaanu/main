package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestingHelper {

    public WebDriver driver;
   
    public void setUpDriver() {
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.manage().window().maximize();
	}
    public WebDriver getDriver() {
		return driver;
	}
	public void openHomePage() {
     driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	
	
	public void tearDown() {
        driver.quit();
	}

}
