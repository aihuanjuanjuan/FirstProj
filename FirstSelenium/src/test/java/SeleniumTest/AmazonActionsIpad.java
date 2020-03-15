package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonActionsIpad {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1.open the homepage of Amazon 2.enter "ipad" into the search field 3.click
		 * the search icon 4.in new page which is result of search, click first
		 * productfrom search result 5.in the product page, click add to cart 6. click
		 * on no thanks 7. click on proceed to check out 8.get title of new
		 * page---Amazon Sign-In
		 */

//		WebDriverManager.chromedriver().setup();
//
//		WebDriver driver = new ChromeDriver();
//		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");

		// Thread.sleep(3000);
// waiting for the element "field-keywords" is visible
		WebDriverWait wt = new WebDriverWait(driver, 20);
		WebElement Searchfield = wt
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("field-keywords"))));
		// input words "ipad" in the search field
		Searchfield.sendKeys("ipad" + Keys.ENTER);

		// driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[@class='a-size-medium a-color-base a-text-normal'][contains(.,'New Apple iPad (10.2-Inch, Wi-Fi + Cellular, 128GB) - Space Gray (Latest Model)')]"))
				.click();

		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		// System.out.println(driver.findElement(By.xpath("//h1[contains(.,'Add to your
		// order')]")).getText());
		driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
		Thread.sleep(2000);
		if (driver.getTitle().equals("Amazon Sign-In")) {
			System.out.println("The test pass");
		} else {
			System.out.println("The test failed");
		}

//		// Actions ac = new Actions(driver);
//
//		ac.moveToElement(driver.findElement(By.xpath("//input[contains(@type,'submit')]"))).click().build().perform();
//
//		ac.moveToElement(driver.findElement(By.xpath(
//				"(//span[contains(.,'New Apple iPad (10.2-Inch, Wi-Fi + Cellular, 128GB) - Space Gray (Latest Model)')])[3]")))
//				.click().build().perform();

//		ac.moveToElement(driver.findElement(By.id("add-to-cart-button"))).click().build().perform();
//
//		// driver.switchTo().alert().dismiss();
//
//		ac.moveToElement(driver.findElement(By.id("attachSiNoCoverage-announce"))).click().build().perform();
//
//		ac.moveToElement(driver.findElement(By.id("hlb-ptc-btn-native"))).click().build().perform();

	}

}
