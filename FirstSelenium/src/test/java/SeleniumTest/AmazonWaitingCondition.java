package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWaitingCondition {

	private static final WebElement FirstProduct = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// setup Chrome driver
		WebDriverManager.chromedriver().setup();

		// open Chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// go to the Amazon homepage
		driver.get("https://www.amazon.com/");

		// waiting for the element "field-keywords" is visible
		WebDriverWait wt = new WebDriverWait(driver, 40);
		WebElement Searchfield = wt
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("field-keywords"))));

		// input words "ipad" in the search fieldF
		Searchfield.sendKeys("ipad" + Keys.ENTER);

		// waiting for the first product picture is visible and click
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//img[@data-image-index='0']"))))
				.click();

//		WebDriverWait wt1 = new WebDriverWait(driver, 4000);
//		wt1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(
//				"//span[@class='a-size-medium a-color-base a-text-normal'][contains(.,'New Apple iPad (10.2-Inch, Wi-Fi + Cellular, 32GB) - Space Gray (Latest Model)')]"))))
//				.click();

		// waiting for the "Add to cart" button is visible and click
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("add-to-cart-button")))).click();
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("add-to-cart-button")))).click();

//		Thread.sleep(3000);
		// waiting for the "No Thanks" button is visible and click
		wt.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//button[@id='attachSiNoCoverage-announce']"))))
				.click();

		// waiting for the "Proceed to checkout" button is visible and click
		wt.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']"))))
				.click();

		// get the title and sysout
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		// close the browser
		driver.close();

	}

}
