package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_navigate {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		/*
		 * get() is used to navigate particular URL(website) and wait till page load.
		 * driver.navigate() is used to navigate to particular URL and does not wait to
		 * page load. It maintains browser history or cookies to navigate back or
		 * forward.
		 */

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.get("https://www.amazon.com/");
		// driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();

		// different between driver.get vs driver.navigate.to
		// driver.get wait for page fully loaded
		// driver.navigate.to doen't wait till loaded

	}

}
