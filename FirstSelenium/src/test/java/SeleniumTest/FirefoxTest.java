package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

	public static void main(String[] args) {

		System.out.println();

		WebDriverManager.firefoxdriver().setup();
		
		

		
		WebDriver driver = new FirefoxDriver();
		
		
		// webdriver is interface, classess--chromedriver, firefoxdriver, iedriver
		//
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

}
