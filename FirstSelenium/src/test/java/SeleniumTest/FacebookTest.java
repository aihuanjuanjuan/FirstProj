package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) {
		
		System.out.println();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aihua\\eclipse-workspace\\FirstSelenium\\src\\test\\java\\SeleniumTest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//webdriver is interface, classess--chromedriver, firefoxdriver, iedriver 
		//
		driver.get("https://www.facebook.com/");
	}

}
