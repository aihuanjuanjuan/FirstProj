package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {

	public static void main(String[] args) {
		/*
		 * create your own custom xpath
		 *	//tagname[@attribute=value]
		 */  
		//setting up chrome driver.
		WebDriverManager.chromedriver().setup();
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		//go to the facebook website
//		/*
//		 *Signup testcase:
//		 *1.open Facebook page
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		 *2.find the Firstname field/textbox and enter "Fei"
		WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Fei"+Keys.TAB+"AI");
//		 *3.find the Lastname field/textbox and enter "Ai"
		//WebElement Lastname=driver.findElement(By.name("lastname"));
		//Lastname.sendKeys("Ai");
//		 *4.find the Mobile number or email field/textbox and enter "afhaihf@gamil.com"
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("afhaihf@gamil.com");
//		 *5.find the Re-enter Email field/textbox and enter "afhaihf@gamil.com"
		WebElement confirm_email=driver.findElement(By.name("reg_email_confirmation__"));
		confirm_email.sendKeys("afhaihf@gamil.com");
//		 *6.find the new password field/textbox and enter "4326195692"
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("4326195692");		
//		 *7.Select birthday month by "Sep"
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Sep");		
//		 *8.Select birthday day by "20"
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("20");		
//		 *9.Select birthday year by "1978"
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1978");		
//		 *10.Select the gender by "Male"
		driver.findElement(By.xpath("//label[text()='Male']")).click();		
//		 *11.click the button Sign Up
		driver.findElement(By.name("websubmit")).click();
//		 */
		
		
		
	}

}
