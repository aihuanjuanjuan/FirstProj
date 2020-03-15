package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTesting {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		String ExpTitle = "Facebook - Log In or Sign Up";
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

		if (driver.getTitle().equals(ExpTitle)) {
			System.out.println("the test is pass");
		} else {
			System.out.println("the test failed");
		}
		
	driver.close();
		//driver.close-----org.openqa.selenium.NoSuchSessionException: invalid session id
		//driver.quit();
		//driver.quit----org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.quit();
	}

}
