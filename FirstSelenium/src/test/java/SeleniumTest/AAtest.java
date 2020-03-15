package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AAtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// setup Chrome driver
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		System.out.println("testing!!!!!!");

		// open Chrome browser
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		// maximize the window
		driver.manage().window().maximize();

		// go to the American Airlines homepage
		driver.get("https://www.aa.com/homePage.do");

		// find "Round trip" and click
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Round trip')]"))).click().build().perform();
		ac.contextClick();

		// find the original airport field, clear and sendkeys
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys(Keys.DELETE + "JFK");

		// find the original airport field, clear and sendkeys
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys(Keys.DELETE + "IAD");

		// find the "Number of passengers" and select 1
		Select passengers = new Select(driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
		passengers.selectByVisibleText("3");

		// find the Depart date field, clear and sendkeys
		driver.findElement(By.id("aa-leavingOn")).clear();
		driver.findElement(By.id("aa-leavingOn")).sendKeys(Keys.DELETE + "01/18/2020");

		// find the Return date field, clear and sendkeys
		driver.findElement(By.id("aa-returningFrom")).clear();
		driver.findElement(By.id("aa-returningFrom")).sendKeys(Keys.DELETE + "01/20/2020");

		// find the button "Search" and click
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();

		// get the title and sysout
		System.out.println(driver.getTitle());

	}

}
