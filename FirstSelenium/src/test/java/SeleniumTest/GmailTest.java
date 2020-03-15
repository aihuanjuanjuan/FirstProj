package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// chrome setup
		WebDriverManager.chromedriver().setup();

		// open chrome browser
		WebDriver driver = new ChromeDriver();

		// go to gmail homepage
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");

		// max window
		driver.manage().window().maximize();

		// wait 1 seconds
		Thread.sleep(1000);

		

		// find the Firstname field/textbox and enter "Fei"
		// WebElement firstname = driver.findElement(By.id("firstName"));
		// firstname.sendKeys("Fei");

		driver.findElement(By.name("firstName")).sendKeys("Fei");
		// driver.findElement(By.xpath("//input[contains(@aria-label,'First
		// name')]")).sendKeys("Fei");
		
		
		
		
		

		// find the Lastname field/textbox and enter "Ai"
		WebElement Lastname = driver.findElement(By.id("lastName"));
		Lastname.sendKeys("Ai");

		// find the Username field/textbox and enter "Ai123h789"
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Ai123h789");

		// find the password field/textbox and enter "fhaskfhl!!44"
		WebElement Password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		Password.sendKeys("fhaskfhl!!44");

		// find the confirm field/textbox and enter "fhaskfhl!!44"
		WebElement PasswordConfirm = driver.findElement(By.xpath("//input[contains(@aria-label,'Confirm')]"));
		PasswordConfirm.sendKeys("fhaskfhl!!44");

		// span[@class='RveJvd snByac'][contains(.,'Next')]

		// find the button "next" and click
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(.,'Next')]")).click();

	}

}
