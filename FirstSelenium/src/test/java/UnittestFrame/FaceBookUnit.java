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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookUnit {

	public static WebDriver driver = null;

	public static void setup(WebDriver driver) {

		WebDriverManager.firefoxdriver().setup();
		// open the chrome browser
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

	}

	public static void teardown() {
		driver.manage().deleteAllCookies();
		System.out.println("Testing is Completed!!!");
		//driver.close();
	}


	
	
	
	/**
	 * @author aihua
	 * @category testcases
	 */
	@Test
	public void loginfacebook() {
		driver.get("https://www.facebook.com/");

		// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fred@gmail.com");
		String x = "";
		WebElement emailbox = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		emailbox.sendKeys("emaild@gmail.com");
		password.sendKeys("12345asdsdasd");
		// driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("asdasdkjashdajksdhaskjd");
		// driver.findElement(By.linkText("Forgot account?")).click();
		// driver.findElement(By.partialLinkText("account?")).click();
		WebElement loginbutton = driver.findElement(By.xpath("//input[@aria-label='Log In']"));
		WebElement ForgotA = driver.findElement(By.xpath("//a[contains(.,'Forgot account?')]"));

		String str1 = ForgotA.getText();
		System.out.println(str1);
		// ForgotA.click();
		// any link has tagname--- a
		int countofLink = driver.findElements(By.tagName("a")).size();
		System.out.println("We have  " + countofLink + " in facebook homepage");
		// driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();

		teardown();
	}

	/**
	 * @author aihua
	 * @category testcases
	 */
	@Test
	public void signup() {

		/*
		 * create your own custom xpath //tagname[@attribute=value]
		 */
		// setting up chrome driver.

		driver.get("https://www.facebook.com/");
//		 *2.find the Firstname field/textbox and enter "Fei"
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Fei" + Keys.TAB + "AI");
//		 *3.find the Lastname field/textbox and enter "Ai"
		// WebElement Lastname=driver.findElement(By.name("lastname"));
		// Lastname.sendKeys("Ai");
//		 *4.find the Mobile number or email field/textbox and enter "afhaihf@gamil.com"
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("afhaihf@gamil.com");
//		 *5.find the Re-enter Email field/textbox and enter "afhaihf@gamil.com"
		WebElement confirm_email = driver.findElement(By.name("reg_email_confirmation__"));
		confirm_email.sendKeys("afhaihf@gamil.com");
//		 *6.find the new password field/textbox and enter "4326195692"
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("4326195692");
//		 *7.Select birthday month by "Sep"
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Sep");
//		 *8.Select birthday day by "20"
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("20");
//		 *9.Select birthday year by "1978"
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1978");
//		 *10.Select the gender by "Male"
		driver.findElement(By.xpath("//label[text()='Male']")).click();
//		 *11.click the button Sign Up
		driver.findElement(By.name("websubmit")).click();

		teardown();

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
		setup(driver);

	}

	@After
	public void aftermethod() {

		driver.close();
		System.out.println("this is after annotation");

	}

}
