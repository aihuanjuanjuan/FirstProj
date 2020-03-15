package UnittestFrame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AAuinttest {

	public static WebDriver driver = null;

	public static void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	public static void teardown() {
		driver.manage().deleteAllCookies();
		System.out.println("Testing is Completed!!!");
		driver.close();
	}

	@BeforeClass
	public static void bclass() {
		System.out.println("this is before class annotation");
	}

	@AfterClass
	public static void afclass() {
		System.out.println("this is after class annotation");
	}

	@Before
	public void beforemethod() {
		System.out.println("this is before annotation");
		setup();
	}

	@After
	public void aftermethod() {
		System.out.println("this is after annotation");
		teardown();
	}

		
	
	
	/*
	 * @author Fei Ai
	 * 
	 * @category testcases
	 */
	@Test
	public void searchtickets() {
		
		driver.get("https://www.aa.com/homePage.do");
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Round trip')]"))).click().build().perform();
		ac.contextClick();

		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys(Keys.DELETE + "JFK");

		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys(Keys.DELETE + "IAD");

		Select passengers = new Select(driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
		passengers.selectByVisibleText("3");

		driver.findElement(By.id("aa-leavingOn")).clear();
		driver.findElement(By.id("aa-leavingOn")).sendKeys(Keys.DELETE + "01/28/2020");

		driver.findElement(By.id("aa-returningFrom")).clear();
		driver.findElement(By.id("aa-returningFrom")).sendKeys(Keys.DELETE + "02/28/2020");

		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();

		System.out.println(driver.getTitle());



	}

}
