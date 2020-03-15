package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitedAirlinesTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.united.com/en/us");
		// Implicitly wait will wait until page fully loaded, but maxinum wait will be 15 seconds
		
		driver.findElement(By.xpath("//input[@id='roundtrip']")).click();
		driver.findElement(By.xpath("//span[text()='Book with miles']")).click();
		driver.findElement(By.id("bookFlightOriginInput")).sendKeys(Keys.DELETE+"NYC");
		//Thread.sleep(2000);
//		Actions ac=new Actions(driver);
//		ac.sendKeys(driver.findElement(By.id("bookFlightOriginInput")), Keys.DELETE);
		//ac.moveToElement()).sendKeys(Keys.DELETE+"IAD");
		
		
		
		

	}

}
