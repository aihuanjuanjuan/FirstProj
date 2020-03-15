package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver=new ChromeDriver();

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");

		driver.manage().window().maximize();

		Thread.sleep(10000);

		WebElement element = driver.findElement(By.xpath("//img[@alt='close-link']"));
		// alternative way to click webelement
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		// driver.switchTo().alert().accept();

		driver.findElement(By.name("firstname")).sendKeys("Fei");

		driver.findElement(By.id("lastname")).sendKeys("Ai");

		driver.findElement(By.xpath("//input[@value='Male']")).click();

		driver.findElement(By.xpath("//input[@id='exp-0']")).click();

		driver.findElement(By.id("datepicker")).sendKeys("20191215");

		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();

		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();

		Select continent = new Select(driver.findElement(By.id("continents")));

		continent.selectByIndex(0);

		Select multiple = new Select(driver.findElement(By.id("continentsmultiple")));

		System.out.println(multiple.isMultiple());

		multiple.selectByIndex(0);

		multiple.selectByVisibleText("North America");

		multiple.selectByValue("AUS");

		Select seleniumcommand = new Select(driver.findElement(By.id("selenium_commands")));

		seleniumcommand.selectByVisibleText("WebElement Commands");

		seleniumcommand.selectByVisibleText("Browser Commands");
		System.out.println("testing pass");
	}

}
