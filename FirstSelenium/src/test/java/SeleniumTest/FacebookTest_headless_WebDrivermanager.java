package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest_headless_WebDrivermanager {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\aihua\\eclipse-workspace\\FirstSelenium\\src\\test\\java\\SeleniumTest\\chromedriver.exe");
		System.out.println();

		WebDriverManager.chromedriver().setup();
//run chrome in headless mode
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");

		WebDriver driver = new ChromeDriver(co);

		// webdriver is interface, classess--chromedriver, firefoxdriver, iedriver

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}

}
