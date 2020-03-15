package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		System.setProperty("driver.chrome.webdriver", "src/test/java/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String ExpTitle = "Facebook - Log In or Sign Up";
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
		System.out.println(driver.getTitle());
	}

}
