package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IETest {

	public static void main(String[] args) {

		System.out.println();

		WebDriverManager.iedriver().setup();

		
		WebDriver driver = new InternetExplorerDriver();
		// webdriver is interface, classess--chromedriver, firefoxdriver, iedriver
		//
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

}
