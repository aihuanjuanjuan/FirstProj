package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.id("email"))).sendKeys("fred@gmail.com"+Keys.TAB+"1312321312321").build().perform();
		
		ac.contextClick(driver.findElement(By.xpath("//input[@value='Log In']"))).build().perform();
	
		
		
		
//		ac.sendKeys("afhaoifhi@gmail.com").build().perform();
//		
//		ac.moveToElement(driver.findElement(By.id("pass"))).build().perform();
//		
//		ac.sendKeys("325732985720").build().perform();
//		
		
			}

}
